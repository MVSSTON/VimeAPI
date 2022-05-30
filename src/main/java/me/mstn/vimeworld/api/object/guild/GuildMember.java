package me.mstn.vimeworld.api.object.guild;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import me.mstn.vimeworld.api.object.user.User;

@Getter
@Setter
public class GuildMember {

    public enum Status {

        MEMBER, OFFICER, LEADER;

    }

    @SerializedName("user")
    private User.InGuild user;

    @SerializedName("status")
    private Status status;

    @SerializedName("joined")
    private int joined;

    @SerializedName("guildCoins")
    private int guildCoins;

    @SerializedName("guildExp")
    private int guildExp;

    @Override
    public String toString() {
        return "GuildMember{" +
                "user=" + user +
                ", status=" + status +
                ", joined=" + joined +
                ", guildCoins=" + guildCoins +
                ", guildExp=" + guildExp +
                '}';
    }

}
