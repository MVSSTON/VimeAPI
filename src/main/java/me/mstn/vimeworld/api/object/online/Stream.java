package me.mstn.vimeworld.api.object.online;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import me.mstn.vimeworld.api.object.user.User;

@Getter
@Setter
public class Stream {

    @SerializedName("title")
    private String title;

    @SerializedName("owner")
    private String owner;

    @SerializedName("viewers")
    private int viewers;

    @SerializedName("platform")
    private Platform platform;

    @SerializedName("user")
    private User.Normal user;

}
