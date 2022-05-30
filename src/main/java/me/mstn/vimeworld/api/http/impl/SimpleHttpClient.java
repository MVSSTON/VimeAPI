package me.mstn.vimeworld.api.http.impl;

import me.mstn.vimeworld.api.http.HttpClient;
import me.mstn.vimeworld.api.http.HttpRequest;
import me.mstn.vimeworld.api.http.HttpResponse;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Реализация HTTP клиента
 * */
public class SimpleHttpClient implements HttpClient {

    @Override
    public HttpResponse execute(HttpRequest httpRequest) throws IOException {
        HttpURLConnection httpURLConnection = null;

        String url = httpRequest.getUrl();
        URL requestUrl = new URL(url);

        if (httpRequest.hasParams() && !httpRequest.getRequestMethod()
                .equalsIgnoreCase("POST")) {
            requestUrl = new URL(url + "?" + toUrlParams(httpRequest.getParams()));
        }

        try {
            httpURLConnection = (HttpURLConnection) requestUrl
                    .openConnection();
            httpURLConnection.setRequestMethod(httpRequest.getRequestMethod());
            httpURLConnection.setDoOutput(true);

            if (httpRequest.hasParams() && httpRequest.getRequestMethod()
                    .equalsIgnoreCase("POST")) {
                try (DataOutputStream output = new DataOutputStream(httpURLConnection.getOutputStream())) {
                    output.writeBytes(
                            toUrlParams(httpRequest.getParams())
                    );
                    output.flush();
                }
            }

            HttpResponse httpResponse = new HttpResponse(httpURLConnection.getResponseCode());

            if (httpResponse.getStatusCode() >= 200 && httpResponse.getStatusCode() < 300) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(),
                        StandardCharsets.UTF_8))) {
                    httpResponse.setBody(reader.lines()
                            .collect(Collectors.joining())
                    );
                }
            }
            return httpResponse;
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    /**
     * Конвертирует {@link Map} список параметров в URL
     *
     * @param params Список параметров
     * @return URL параметры
     * @throws UnsupportedEncodingException Если возникла ошибка
     */
    private String toUrlParams(Map<String, String> params) throws UnsupportedEncodingException {
        List<String> paramsList = new ArrayList<>(params.size());

        for (Map.Entry<String, String> entry : params.entrySet()) {
            paramsList.add(encode(entry.getKey()) + "=" + encode(entry.getValue()));
        }

        return String.join("&", paramsList);
    }

    /**
     * Переводит кодировку строки на UTF-8
     *
     * @param string Строка для кодирования
     * @return Конечный результат
     * @throws UnsupportedEncodingException Если возникла ошибка
     */
    private String encode(String string) throws UnsupportedEncodingException {
        return URLEncoder.encode(string, "UTF-8");
    }

    /**
     * Читает информацию из {@link InputStream} и записывает в {@link OutputStream}.
     *
     * @param from Из ...
     * @param to В ...
     * @throws IOException Если возникла ошибка
     */
    private void copy(InputStream from, OutputStream to) throws IOException {
        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = from.read(buffer)) != -1) {
            to.write(buffer, 0, bytesRead);
        }
        to.flush();
    }

}
