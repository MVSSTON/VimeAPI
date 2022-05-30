package me.mstn.vimeworld.api.method.impl.misc;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.misc.MapList;

public class MapsMethod extends VimeMethod<MapList> {

    public MapsMethod() {

    }

    public MapsMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "misc/maps";
    }

    @Override
    public Class<MapList> getResponseType() {
        return MapList.class;
    }
}
