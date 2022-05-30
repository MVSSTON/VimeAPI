package me.mstn.vimeworld.api.method;

import me.mstn.vimeworld.api.method.impl.locale.LocaleGetMethod;

public class LocaleMethods {

    private String token;

    public LocaleMethods() {}

    public LocaleMethods(String token) {
        this.token = token;
    }

    public LocaleGetMethod get() {
        LocaleGetMethod method;

        if (token == null)
            method = new LocaleGetMethod();
        else
            method = new LocaleGetMethod(token);

        return method;
    }

}
