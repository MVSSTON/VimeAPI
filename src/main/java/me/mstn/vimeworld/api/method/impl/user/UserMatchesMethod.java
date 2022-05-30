package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;

public class UserMatchesMethod extends VimeMethod<User.Matches> {

    private int id;

    public UserMatchesMethod() {
        super();
    }

    public UserMatchesMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "user/" + id + "/matches";
    }

    public UserMatchesMethod count(int count) {
        return addParam("count", count);
    }

    public UserMatchesMethod offset(int offset) {
        return addParam("offset", offset);
    }

    public UserMatchesMethod after(int after) {
        return addParam("after", after);
    }

    public UserMatchesMethod before(int before) {
        return addParam("before", before);
    }

    public UserMatchesMethod id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public UserMatchesMethod addParam(String key, Object value) {
        return (UserMatchesMethod) super.addParam(key, value);
    }

    @Override
    public Class<User.Matches> getResponseType() {
        return User.Matches.class;
    }

}
