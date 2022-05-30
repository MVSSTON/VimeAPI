package me.mstn.vimeworld.api.object.misc;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import me.mstn.vimeworld.api.object.user.User;

@Getter
@Setter
public class Token {

    @SerializedName("token")
    private String token;

    @SerializedName("valid")
    private boolean valid;

    @SerializedName("type")
    private TokenType type;

    @SerializedName("limit")
    private int limit;

    @SerializedName("owner")
    private User.Normal owner;

    @Override
    public String toString() {
        return "Token{" +
                "token='" + token + '\'' +
                ", valid=" + valid +
                ", type=" + type +
                ", limit=" + limit +
                ", owner=" + owner +
                '}';
    }
}
