package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;

public class UserFriendsMethod extends VimeMethod<User.WithFriends> {

    private int id;

    public UserFriendsMethod() {
        super();
    }

    public UserFriendsMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "user/" + id + "/friends";
    }

    public UserFriendsMethod id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Class<User.WithFriends> getResponseType() {
        return User.WithFriends.class;
    }

}
