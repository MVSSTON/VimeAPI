package me.mstn.vimeworld.api.http;

import lombok.Getter;
import lombok.Setter;

/**
 * Сериализация HTTP ответа
 */
public class HttpResponse {
    /**
     * Статус HTTP ответа
     */
    @Getter
    @Setter
    private int statusCode;

    /**
     * Тело ответа
     */
    @Getter
    @Setter
    private String body;

    public HttpResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    public HttpResponse(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format(
                "Status Code=%d, Body=%s",
                statusCode,
                body
        );
    }
}