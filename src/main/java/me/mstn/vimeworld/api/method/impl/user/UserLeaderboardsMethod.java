package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;

public class UserLeaderboardsMethod extends VimeMethod<User.Leaderboards> {

    private int id;

    public UserLeaderboardsMethod() {
        super();
    }

    public UserLeaderboardsMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "user/" + id + "/leaderboards";
    }

    public UserLeaderboardsMethod id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Class<User.Leaderboards> getResponseType() {
        return User.Leaderboards.class;
    }

}
