package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;
import me.mstn.vimeworld.api.utility.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserByNameMethod extends VimeMethod<User.Normal[]> {

    private final List<String> users = new ArrayList<>();

    public UserByNameMethod() {
        super();
    }

    public UserByNameMethod(String token) {
        super(token);
    }

    public UserByNameMethod users(String... users) {
        this.users.addAll(
                Arrays.asList(users)
        );
        return this;
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "user/name/" + StringUtility.sort(users, ",");
    }

    @Override
    public Class<User.Normal[]> getResponseType() {
        return User.Normal[].class;
    }

}
