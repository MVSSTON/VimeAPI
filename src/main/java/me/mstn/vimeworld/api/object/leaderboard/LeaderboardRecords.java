package me.mstn.vimeworld.api.object.leaderboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class LeaderboardRecords {

    @SerializedName("leaderboard")
    private Settings leaderboard;

    @SerializedName("records")
    private List<HashMap<String, Object>> records;

    @Override
    public String toString() {
        return "LeaderboardRecords{" +
                "leaderboard=" + leaderboard +
                ", records=" + records +
                '}';
    }

    @Getter
    @Setter
    public static class Settings {

        @SerializedName("type")
        private String type;

        @SerializedName("sort")
        private String sort;

        @SerializedName("offset")
        private int offset;

        @SerializedName("size")
        private int size;

        @SerializedName("max_size")
        private int maxSize;

        @Override
        public String toString() {
            return "Settings{" +
                    "type='" + type + '\'' +
                    ", sort='" + sort + '\'' +
                    ", offset=" + offset +
                    ", size=" + size +
                    ", maxSize=" + maxSize +
                    '}';
        }
    }

}
