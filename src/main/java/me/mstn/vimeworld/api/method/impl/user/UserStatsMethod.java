package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;

public class UserStatsMethod extends VimeMethod<User.Stats> {

    private int id;

    public UserStatsMethod() {
        super();
    }

    public UserStatsMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "user/" + id + "/stats";
    }

    public UserStatsMethod id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Class<User.Stats> getResponseType() {
        return User.Stats.class;
    }

}
