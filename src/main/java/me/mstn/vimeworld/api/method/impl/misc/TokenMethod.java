package me.mstn.vimeworld.api.method.impl.misc;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.misc.Token;

public class TokenMethod extends VimeMethod<Token> {

    private final String token;

    public TokenMethod(String token) {
        this.token = token;
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "misc/token/" + token;
    }

    @Override
    public Class<Token> getResponseType() {
        return Token.class;
    }
}
