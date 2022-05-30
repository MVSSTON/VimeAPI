package me.mstn.vimeworld.api.method.impl.leaderboard;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.leaderboard.LeaderboardRecords;

public class LeaderboardGetMethod extends VimeMethod<LeaderboardRecords> {

    private String type;

    private String sort;

    public LeaderboardGetMethod() {
        super();
    }

    public LeaderboardGetMethod(String token) {
        super(token);
    }

    @Override
    public Class<LeaderboardRecords> getResponseType() {
        return LeaderboardRecords.class;
    }

    public LeaderboardGetMethod type(String type) {
        this.type = type;
        return this;
    }

    public LeaderboardGetMethod sort(String sort) {
        this.sort = sort;
        return this;
    }

    public LeaderboardGetMethod size(int size) {
        return addParam("size", size);
    }

    public LeaderboardGetMethod offset(int offset) {
        return addParam("offset", offset);
    }

    @Override
    public LeaderboardGetMethod addParam(String key, Object value) {
        return (LeaderboardGetMethod) super.addParam(key, value);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "leaderboard/get/" + type + (sort != null ? "/" + sort : "");
    }

}
