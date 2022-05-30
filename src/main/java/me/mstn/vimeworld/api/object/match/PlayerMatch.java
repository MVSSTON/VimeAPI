package me.mstn.vimeworld.api.object.match;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerMatch {

    @SerializedName("id")
    private String id;

    @SerializedName("game")
    private String game;

    @SerializedName("map")
    private Match.Map map;

    @SerializedName("date")
    private int date;

    @SerializedName("duration")
    private int duration;

    @SerializedName("players")
    private int players;

    @SerializedName("win")
    private boolean win;

    @SerializedName("state")
    private int state;

    @Override
    public String toString() {
        return "PlayerMatch{" +
                "id='" + id + '\'' +
                ", game='" + game + '\'' +
                ", map=" + map +
                ", date=" + date +
                ", duration=" + duration +
                ", players=" + players +
                ", win=" + win +
                ", state=" + state +
                '}';
    }
}