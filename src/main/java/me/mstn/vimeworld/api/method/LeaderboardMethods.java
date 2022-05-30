package me.mstn.vimeworld.api.method;

import me.mstn.vimeworld.api.method.impl.leaderboard.LeaderboardGetMethod;
import me.mstn.vimeworld.api.method.impl.leaderboard.LeaderboardListMethod;

public class LeaderboardMethods {

    private String token;

    public LeaderboardMethods() {}

    public LeaderboardMethods(String token) {
        this.token = token;
    }

    public LeaderboardListMethod list() {
        LeaderboardListMethod method;

        if (token == null)
            method = new LeaderboardListMethod();
        else
            method = new LeaderboardListMethod(token);

        return method;
    }

    public LeaderboardGetMethod get() {
        LeaderboardGetMethod method;

        if (token == null)
            method = new LeaderboardGetMethod();
        else
            method = new LeaderboardGetMethod(token);

        return method;
    }

}
