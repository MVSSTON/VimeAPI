package me.mstn.vimeworld.api.exception;

import me.mstn.vimeworld.api.http.HttpRequest;
import me.mstn.vimeworld.api.http.HttpResponse;

/**
 * Возникает когда HTTP код 400 или выше
 */
public class ApiHttpException extends ApiException {

    public ApiHttpException(HttpRequest httpRequest, HttpResponse httpResponse) {
        super("Server returned HTTP response code: " + httpResponse.getStatusCode() + " for URL: "
                + httpRequest.getUrl());
    }

}