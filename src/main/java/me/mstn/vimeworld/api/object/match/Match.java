package me.mstn.vimeworld.api.object.match;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Match {

    @SerializedName("id")
    private String id;

    @SerializedName("game")
    private String game;

    @SerializedName("map")
    private Map map;

    @SerializedName("date")
    private int date;

    @SerializedName("duration")
    private int duration;

    @SerializedName("players")
    private int players;

    @Override
    public String toString() {
        return "Match{" +
                "id='" + id + '\'' +
                ", game='" + game + '\'' +
                ", map=" + map +
                ", date=" + date +
                ", duration=" + duration +
                ", players=" + players +
                '}';
    }

    @Getter
    @Setter
    public static class Map {

        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("teams")
        private int teams;

        @SerializedName("playersInTeam")
        private int playersInTeam;

        @Override
        public String toString() {
            return "Map{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", teams=" + teams +
                    ", playersInTeam=" + playersInTeam +
                    '}';
        }
    }

}