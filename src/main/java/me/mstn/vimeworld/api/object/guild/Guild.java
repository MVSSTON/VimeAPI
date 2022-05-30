package me.mstn.vimeworld.api.object.guild;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

public class Guild {

    @Getter
    @Setter
    public static class InUser {

        @SerializedName("id")
        private int id;

        @SerializedName("name")
        private String name;

        @SerializedName("tag")
        private String tag;

        @SerializedName("color")
        private String color;

        @SerializedName("level")
        private int level;

        @SerializedName("levelPercentage")
        private double levelPercentage;

        @SerializedName("avatar_url")
        private String avatarUrl;

        @Override
        public String toString() {
            return "InUser{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", tag='" + tag + '\'' +
                    ", color='" + color + '\'' +
                    ", level=" + level +
                    ", levelPercentage=" + levelPercentage +
                    ", avatarUrl='" + avatarUrl + '\'' +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Perk {

        @SerializedName("name")
        private String name;

        @SerializedName("level")
        private int level;

        @Override
        public String toString() {
            return "Perk{" +
                    "name='" + name + '\'' +
                    ", level=" + level +
                    '}';
        }
    }

    @Getter
    @Setter
    public static class Full {

        @SerializedName("id")
        private int id;

        @SerializedName("name")
        private String name;

        @SerializedName("tag")
        private String tag;

        @SerializedName("color")
        private String color;

        @SerializedName("level")
        private int level;

        @SerializedName("levelPercentage")
        private double levelPercentage;

        @SerializedName("avatar_url")
        private String avatarUrl;

        @SerializedName("totalExp")
        private int totalExp;

        @SerializedName("totalCoins")
        private int totalCoins;

        @SerializedName("created")
        private int created;

        @SerializedName("web_info")
        private String webInfo;

        @SerializedName("perks")
        private HashMap<String, Perk> perks;

        @SerializedName("members")
        private List<GuildMember> members;

        @Override
        public String toString() {
            return "Full{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", tag='" + tag + '\'' +
                    ", color='" + color + '\'' +
                    ", level=" + level +
                    ", levelPercentage=" + levelPercentage +
                    ", avatarUrl='" + avatarUrl + '\'' +
                    ", totalExp=" + totalExp +
                    ", totalCoins=" + totalCoins +
                    ", created=" + created +
                    ", webInfo='" + webInfo + '\'' +
                    ", perks=" + perks +
                    ", members=" + members +
                    '}';
        }
    }

}
