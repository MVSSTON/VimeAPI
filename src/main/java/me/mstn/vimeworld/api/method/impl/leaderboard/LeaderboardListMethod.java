package me.mstn.vimeworld.api.method.impl.leaderboard;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.leaderboard.LeaderboardRow;

public class LeaderboardListMethod extends VimeMethod<LeaderboardRow[]> {

    public LeaderboardListMethod() {
        super();
    }

    public LeaderboardListMethod(String token) {
        super(token);
    }

    @Override
    public Class<LeaderboardRow[]> getResponseType() {
        return LeaderboardRow[].class;
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "leaderboard/list";
    }

}
