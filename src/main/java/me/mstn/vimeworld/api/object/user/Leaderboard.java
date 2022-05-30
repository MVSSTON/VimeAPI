package me.mstn.vimeworld.api.object.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Leaderboard {

    @SerializedName("type")
    private String type;

    @SerializedName("sort")
    private String sort;

    @SerializedName("place")
    private int place;

    @Override
    public String toString() {
        return "Leaderboard{" +
                "type='" + type + '\'' +
                ", sort='" + sort + '\'' +
                ", place=" + place +
                '}';
    }
}
