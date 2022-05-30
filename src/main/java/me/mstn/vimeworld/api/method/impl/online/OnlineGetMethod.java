package me.mstn.vimeworld.api.method.impl.online;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.online.Online;

public class OnlineGetMethod extends VimeMethod<Online> {

    public OnlineGetMethod() {
    }

    public OnlineGetMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "online";
    }

    @Override
    public Class<Online> getResponseType() {
        return Online.class;
    }

}
