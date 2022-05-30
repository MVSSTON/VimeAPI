package me.mstn.vimeworld.api.method;

import me.mstn.vimeworld.api.method.impl.match.MatchByIdMethod;
import me.mstn.vimeworld.api.method.impl.match.LatestMatchesMethod;
import me.mstn.vimeworld.api.method.impl.match.MatchListMethod;

public class MatchMethods {

    private String token;

    public MatchMethods() {}

    public MatchMethods(String token) {
        this.token = token;
    }

    public LatestMatchesMethod latest() {
        LatestMatchesMethod method;

        if (token == null)
            method = new LatestMatchesMethod();
        else
            method = new LatestMatchesMethod(token);

        return method;
    }

    public MatchByIdMethod byId() {
        MatchByIdMethod method;

        if (token == null)
            method = new MatchByIdMethod();
        else
            method = new MatchByIdMethod(token);

        return method;
    }

    public MatchListMethod list() {
        MatchListMethod method;

        if (token == null)
            method = new MatchListMethod();
        else
            method = new MatchListMethod(token);

        return method;
    }

}
