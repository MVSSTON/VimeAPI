package me.mstn.vimeworld.api.object.leaderboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LeaderboardRow {

    @SerializedName("type")
    private String type;

    @SerializedName("description")
    private String description;

    @SerializedName("max_size")
    private int maxSize;

    @SerializedName("sort")
    private List<String> sort;

    @Override
    public String toString() {
        return "LeaderboardRow{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", maxSize=" + maxSize +
                ", sort=" + sort +
                '}';
    }
}
