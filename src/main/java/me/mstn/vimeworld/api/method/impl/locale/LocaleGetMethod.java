package me.mstn.vimeworld.api.method.impl.locale;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.locale.Locale;
import me.mstn.vimeworld.api.utility.StringUtility;

import java.util.Arrays;

public class LocaleGetMethod extends VimeMethod<Locale> {

    private String locale;

    public LocaleGetMethod() {

    }

    public LocaleGetMethod(String token) {
        super(token);
    }

    public LocaleGetMethod locale(String locale) {
        this.locale = locale;
        return this;
    }

    public LocaleGetMethod parts(String... parts) {
        return addParam("parts", StringUtility.sort(Arrays.asList(parts), ","));
    }

    @Override
    public LocaleGetMethod addParam(String key, Object value) {
        return (LocaleGetMethod) super.addParam(key, value);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "locale/" + locale;
    }

    @Override
    public Class<Locale> getResponseType() {
        return Locale.class;
    }
}
