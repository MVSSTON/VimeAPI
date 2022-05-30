package me.mstn.vimeworld.api.exception;

import com.google.gson.JsonObject;
import lombok.Getter;

public class ApiResponseException extends ApiException {

    /**
     * Объект ошибки
     */
    @Getter
    private final JsonObject error;

    public ApiResponseException(String message, JsonObject error) {
        super(message);
        this.error = error;
    }

}