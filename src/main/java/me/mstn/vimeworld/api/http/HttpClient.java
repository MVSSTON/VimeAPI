package me.mstn.vimeworld.api.http;

import java.io.IOException;

/**
 * HTTP клиент для отправки HTTP запросов
 */
public interface HttpClient {

    /**
     * Отправляет HTTP запрос
     *
     * @param httpRequest HTTP запрос дял отправки
     * @return Ответ
     * @throws IOException Если возникают ошибки
     */
    HttpResponse execute(HttpRequest httpRequest) throws IOException;
}