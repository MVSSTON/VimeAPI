package me.mstn.vimeworld.api.validator.impl;

import com.google.gson.JsonElement;
import me.mstn.vimeworld.api.validator.IValidator;

/**
 * Реализация валидатора ответов
 */
public class ApiResponseValidator implements IValidator<JsonElement> {

    @Override
    public boolean isValid(JsonElement object) {
        return object == null
                || !object.isJsonObject()
                || !object.getAsJsonObject()
                .has("error");
    }

}
