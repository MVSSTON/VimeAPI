package me.mstn.vimeworld.api.http;

import java.util.List;
import java.util.Map;

/**
 * Сериализация HTTP запроса
 */
public interface HttpRequest {
    /**
     * Получает метод HTTP запроса (POST, GET и т.д)
     *
     * @return HTTP метод
     */
    String getRequestMethod();

    /**
     * Получает URL HTTP запроса
     *
     * @return URL HTTP запроса
     */
    String getUrl();

    /**
     * Получает параметры для запроса
     *
     * @return Параметры из URL HTTP запроса
     */
    Map<String, String> getParams();

    /**
     * Имеет ли этот запрос параметры
     *
     * @return <b>true</b> если запрос имеет параметры, <b>false</b> если нет.
     */
    default boolean hasParams() {
        return getParams() != null && !getParams().isEmpty();
    }

}