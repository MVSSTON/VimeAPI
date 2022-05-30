package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;
import me.mstn.vimeworld.api.utility.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersSessionsMethod extends VimeMethod<User.Session[]> {

    private final List<Integer> users = new ArrayList<>();

    public UsersSessionsMethod() {
        super();
    }

    public UsersSessionsMethod(String token) {
        super(token);
    }

    public UsersSessionsMethod users(Integer... users) {
        this.users.addAll(
                Arrays.asList(users)
        );
        return this;
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "session/" + StringUtility.sortInteger(users, ",");
    }

    @Override
    public Class<User.Session[]> getResponseType() {
        return User.Session[].class;
    }

}