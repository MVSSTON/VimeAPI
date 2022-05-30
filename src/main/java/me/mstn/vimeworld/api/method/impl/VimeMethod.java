package me.mstn.vimeworld.api.method.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import lombok.Getter;
import me.mstn.vimeworld.api.exception.ApiException;
import me.mstn.vimeworld.api.exception.ApiHttpException;
import me.mstn.vimeworld.api.exception.ApiResponseException;
import me.mstn.vimeworld.api.http.HttpClient;
import me.mstn.vimeworld.api.http.HttpRequest;
import me.mstn.vimeworld.api.http.HttpResponse;
import me.mstn.vimeworld.api.http.impl.SimpleHttpClient;
import me.mstn.vimeworld.api.validator.IValidator;
import me.mstn.vimeworld.api.validator.impl.ApiResponseValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public abstract class VimeMethod<R> implements HttpRequest {

    /**
     * Параметры запроса
     */
    @Getter
    private final Map<String, String> params = new HashMap<>();

    /**
     * HTTP клиент
     */
    private final HttpClient httpClient = new SimpleHttpClient();

    /**
     * Валидатор ответа
     */
    private final IValidator<JsonElement> responseValidator = new ApiResponseValidator();

    /**
     * {@link Gson} инстанс
     */
    @Getter
    private final Gson gson = new Gson();

    public VimeMethod() {}

    public VimeMethod(String token) {
        if (token != null)
            addParam("token", token);
    }

    /**
     * Делает запрос к API асинхронно
     *
     * @return Ответ сервера в {@link CompletableFuture}
     */
    public CompletableFuture<R> executeAsync() {
        return call(this::execute);
    }

    /**
     * Выполняет запрос к VimeWorld API
     *
     * @return Ответ API
     * @throws ApiException Если возникла ошибкка
     */
    public R execute() throws ApiException {
        try {
            HttpResponse httpResponse = httpClient.execute(this);

            if (httpResponse.getStatusCode() >= 400) {
                throw new ApiHttpException(this, httpResponse);
            }

            JsonElement jsonElement = gson.fromJson(httpResponse.getBody(), JsonElement.class);

            if (responseValidator.isValid(jsonElement)) {
                return gson.fromJson(jsonElement, getResponseType());
            }

            throw new ApiResponseException(httpResponse.getBody(), jsonElement.getAsJsonObject());
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Получает тип ответа для запроса
     * для сериализации в объект
     *
     * @return Класс генерика
     * */
    public abstract Class<R> getResponseType();

    /**
     * Добавляет параметр к запросу
     *
     * @param key Ключ параметра
     * @param value Значение параметра
     * @return Инстанс метода
     */
    public VimeMethod<R> addParam(String key, Object value) {
        params.put(key, String.valueOf(value));
        return this;
    }

    /**
    * Возвращает тип запроса
    * @return Тип запроса
    * */
    @Override
    public String getRequestMethod() {
        return "GET";
    }

    /**
     * Скрывает <i>token</i> для логирования
     *
     * @return Параметры запроса
     */
    private Map<String, String> getNonSensitiveParams() {
        return new HashMap<String, String>(params) {{
            computeIfPresent(
                    "token",
                    (key, value) -> value.replaceAll(".", "*")
            );
        }};
    }

    @Override
    public String toString() {
        return String.format(
                "Method=%s, URL=%s, Params=%s",
                getRequestMethod(),
                getUrl(),
                getNonSensitiveParams()
        );
    }

    private <T> CompletableFuture<T> call(Callable<T> callable) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }

}
