package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;

public class UserSessionMethod extends VimeMethod<User.WithSession> {

    private int id;

    public UserSessionMethod() {
        super();
    }

    public UserSessionMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "user/" + id + "/session";
    }

    public UserSessionMethod id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Class<User.WithSession> getResponseType() {
        return User.WithSession.class;
    }

}
