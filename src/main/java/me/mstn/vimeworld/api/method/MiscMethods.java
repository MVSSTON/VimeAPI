package me.mstn.vimeworld.api.method;

import me.mstn.vimeworld.api.method.impl.misc.AchievementsMethod;
import me.mstn.vimeworld.api.method.impl.misc.GamesMethod;
import me.mstn.vimeworld.api.method.impl.misc.MapsMethod;
import me.mstn.vimeworld.api.method.impl.misc.TokenMethod;

public class MiscMethods {

    private String token;

    public MiscMethods() {}

    public MiscMethods(String token) {
        this.token = token;
    }

    public GamesMethod games() {
        GamesMethod method;

        if (token == null)
            method = new GamesMethod();
        else
            method = new GamesMethod(token);

        return method;
    }

    public MapsMethod maps() {
        MapsMethod method;

        if (token == null)
            method = new MapsMethod();
        else
            method = new MapsMethod(token);

        return method;
    }

    public AchievementsMethod achievements() {
        AchievementsMethod method;

        if (token == null)
            method = new AchievementsMethod();
        else
            method = new AchievementsMethod(token);

        return method;
    }

    public TokenMethod token() {
        TokenMethod method;

        method = new TokenMethod(token);

        return method;
    }

}
