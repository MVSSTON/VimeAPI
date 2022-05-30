package me.mstn.vimeworld.api.object.misc;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VimeMap {

    @SerializedName("name")
    private String name;

    @SerializedName("teams")
    private int teams;

    @SerializedName("playersInTeam")
    private int playersInTeam;

    @Override
    public String toString() {
        return "Map{" +
                "name='" + name + '\'' +
                ", teams=" + teams +
                ", playersInTeam=" + playersInTeam +
                '}';
    }

}
