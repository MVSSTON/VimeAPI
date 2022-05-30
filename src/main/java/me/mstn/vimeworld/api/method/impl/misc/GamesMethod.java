package me.mstn.vimeworld.api.method.impl.misc;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.misc.GameList;

public class GamesMethod extends VimeMethod<GameList> {

    public GamesMethod() {

    }

    public GamesMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "misc/games";
    }

    @Override
    public Class<GameList> getResponseType() {
        return GameList.class;
    }
}
