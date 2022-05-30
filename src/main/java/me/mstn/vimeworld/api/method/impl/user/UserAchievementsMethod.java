package me.mstn.vimeworld.api.method.impl.user;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.user.User;

public class UserAchievementsMethod extends VimeMethod<User.Achievements> {

    private int id;

    public UserAchievementsMethod() {
        super();
    }

    public UserAchievementsMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "user/" + id + "/achievements";
    }

    public UserAchievementsMethod id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Class<User.Achievements> getResponseType() {
        return User.Achievements.class;
    }

}
