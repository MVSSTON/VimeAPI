package me.mstn.vimeworld.api.method;

import me.mstn.vimeworld.api.method.impl.user.*;

public class UserMethods {

    private String token;

    public UserMethods() {}

    public UserMethods(String token) {
        this.token = token;
    }

    public UserByNameMethod byName() {
        UserByNameMethod method;

        if (token == null)
            method = new UserByNameMethod();
        else
            method = new UserByNameMethod(token);

        return method;
    }

    public UserByIdMethod byId() {
        UserByIdMethod method;

        if (token == null)
            method = new UserByIdMethod();
        else
            method = new UserByIdMethod(token);

        return method;
    }

    public UserFriendsMethod friends() {
        UserFriendsMethod method;

        if (token == null)
            method = new UserFriendsMethod();
        else
            method = new UserFriendsMethod(token);

        return method;
    }

    public UserSessionMethod session() {
        UserSessionMethod method;

        if (token == null)
            method = new UserSessionMethod();
        else
            method = new UserSessionMethod(token);

        return method;
    }

    public UserStatsMethod stats() {
        UserStatsMethod method;

        if (token == null)
            method = new UserStatsMethod();
        else
            method = new UserStatsMethod(token);

        return method;
    }

    public UserAchievementsMethod achievements() {
        UserAchievementsMethod method;

        if (token == null)
            method = new UserAchievementsMethod();
        else
            method = new UserAchievementsMethod(token);

        return method;
    }

    public UserLeaderboardsMethod leaderboards() {
        UserLeaderboardsMethod method;

        if (token == null)
            method = new UserLeaderboardsMethod();
        else
            method = new UserLeaderboardsMethod(token);

        return method;
    }

    public UserMatchesMethod matches() {
        UserMatchesMethod method;

        if (token == null)
            method = new UserMatchesMethod();
        else
            method = new UserMatchesMethod(token);

        return method;
    }

    public UsersSessionsMethod sessions() {
        UsersSessionsMethod method;

        if (token == null)
            method = new UsersSessionsMethod();
        else
            method = new UsersSessionsMethod(token);

        return method;
    }

}
