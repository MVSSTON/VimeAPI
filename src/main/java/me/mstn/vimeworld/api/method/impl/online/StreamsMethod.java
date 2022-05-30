package me.mstn.vimeworld.api.method.impl.online;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.online.Stream;

public class StreamsMethod extends VimeMethod<Stream[]> {

    public StreamsMethod() {
    }

    public StreamsMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "online/streams";
    }

    @Override
    public Class<Stream[]> getResponseType() {
        return Stream[].class;
    }

}
