package me.mstn.vimeworld.api.method.impl.online;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;

public class StaffMethod extends VimeMethod<User.Session[]> {

    public StaffMethod() {
    }

    public StaffMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "online/staff";
    }

    @Override
    public Class<User.Session[]> getResponseType() {
        return User.Session[].class;
    }

}
