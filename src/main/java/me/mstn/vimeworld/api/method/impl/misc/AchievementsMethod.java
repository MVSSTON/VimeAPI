package me.mstn.vimeworld.api.method.impl.misc;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.misc.AchievementList;

public class AchievementsMethod extends VimeMethod<AchievementList> {

    public AchievementsMethod() {

    }

    public AchievementsMethod(String token) {
        super(token);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "misc/achievements";
    }

    @Override
    public Class<AchievementList> getResponseType() {
        return AchievementList.class;
    }
}
