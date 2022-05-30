package me.mstn.vimeworld.api.object.misc;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Achievement {

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("reward")
    private int reward;

    @SerializedName("description")
    private List<String> description;

    @Override
    public String toString() {
        return "Achievement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", reward=" + reward +
                ", description=" + description +
                '}';
    }
}
