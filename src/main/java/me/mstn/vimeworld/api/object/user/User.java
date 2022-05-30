package me.mstn.vimeworld.api.object.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import me.mstn.vimeworld.api.object.guild.Guild;
import me.mstn.vimeworld.api.object.match.PlayerMatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class User {

    @Getter
    @Setter
    public static class Normal {

        @SerializedName("id")
        private int id;

        @SerializedName("username")
        private String username;

        @SerializedName("level")
        private int level;

        @SerializedName("levelPercentage")
        private double levelPercentage;

        @SerializedName("rank")
        private Rank rank;

        @SerializedName("playedSeconds")
        private int playedSeconds;

        @SerializedName("lastSeen")
        private int lastSeen;

        @SerializedName("guild")
        private Guild.InUser guild;

        @Override
        public String toString() {
            return "Normal{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", level=" + level +
                    ", levelPercentage=" + levelPercentage +
                    ", rank=" + rank +
                    ", playedSeconds=" + playedSeconds +
                    ", lastSeen=" + lastSeen +
                    ", guild=" + guild +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class InGuild {

        @SerializedName("id")
        private int id;

        @SerializedName("username")
        private String username;

        @SerializedName("level")
        private int level;

        @SerializedName("levelPercentage")
        private double levelPercentage;

        @SerializedName("rank")
        private Rank rank;

        @SerializedName("playedSeconds")
        private int playedSeconds;

        @SerializedName("lastSeen")
        private int lastSeen;

        @Override
        public String toString() {
            return "Normal{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", level=" + level +
                    ", levelPercentage=" + levelPercentage +
                    ", rank=" + rank +
                    ", playedSeconds=" + playedSeconds +
                    ", lastSeen=" + lastSeen +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class WithFriends {

        @SerializedName("user")
        private User.Normal user;

        @SerializedName("friends")
        private User.Normal[] friends;

        @Override
        public String toString() {
            return "WithFriends{" +
                    "user=" + user +
                    ", friends=" + Arrays.toString(friends) +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class WithSession {

        @SerializedName("user")
        private User.Normal user;

        @SerializedName("online")
        private HashMap<String, Object> online;

        @Override
        public String toString() {
            return "Session{" +
                    "user=" + user +
                    ", online=" + online +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Stats {

        @SerializedName("user")
        private User.Normal user;

        @SerializedName("stats")
        private HashMap<String, Object> stats;

        @Override
        public String toString() {
            return "Stats{" +
                    "user=" + user +
                    ", stats=" + stats +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Achievements {

        @SerializedName("user")
        private User.Normal user;

        @SerializedName("achievements")
        private List<PlayerAchievement> playerAchievements;

        @Override
        public String toString() {
            return "Achievements{" +
                    "user=" + user +
                    ", achievements=" + playerAchievements +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Leaderboards {

        @SerializedName("user")
        private User.Normal user;

        @SerializedName("leaderboards")
        private List<Leaderboard> leaderboards;

        @Override
        public String toString() {
            return "Leaderboards{" +
                    "user=" + user +
                    ", leaderboards=" + leaderboards +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Matches {

        @SerializedName("user")
        private User.Normal user;

        @SerializedName("request")
        private Request request;

        @SerializedName("matches")
        private List<PlayerMatch> matches;

        @Override
        public String toString() {
            return "Matches{" +
                    "user=" + user +
                    ", request=" + request +
                    ", matches=" + matches +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Request {

        @SerializedName("count")
        private int count;

        @SerializedName("offset")
        private int offset;

        @SerializedName("size")
        private int size;

        @Override
        public String toString() {
            return "Request{" +
                    "count=" + count +
                    ", offset=" + offset +
                    ", size=" + size +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Session {

        @SerializedName("id")
        private int id;

        @SerializedName("username")
        private String username;

        @SerializedName("level")
        private int level;

        @SerializedName("levelPercentage")
        private double levelPercentage;

        @SerializedName("rank")
        private Rank rank;

        @SerializedName("playedSeconds")
        private int playedSeconds;

        @SerializedName("lastSeen")
        private int lastSeen;

        @SerializedName("guild")
        private Guild.InUser guild;

        @SerializedName("online")
        private HashMap<String, Object> online;

        @Override
        public String toString() {
            return "Session{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", level=" + level +
                    ", levelPercentage=" + levelPercentage +
                    ", rank=" + rank +
                    ", playedSeconds=" + playedSeconds +
                    ", lastSeen=" + lastSeen +
                    ", guild=" + guild +
                    ", online=" + online +
                    '}';
        }
    }

}
