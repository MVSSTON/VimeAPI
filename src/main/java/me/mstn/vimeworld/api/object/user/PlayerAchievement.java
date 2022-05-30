package me.mstn.vimeworld.api.object.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerAchievement {

    @SerializedName("id")
    private int id;

    @SerializedName("time")
    private int time;

    @Override
    public String toString() {
        return "Achievement{" +
                "id=" + id +
                ", time=" + time +
                '}';
    }
}
