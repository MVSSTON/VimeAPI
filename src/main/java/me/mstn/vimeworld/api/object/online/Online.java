package me.mstn.vimeworld.api.object.online;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Online {

    @SerializedName("total")
    private int total;

    @SerializedName("separated")
    private HashMap<String, Integer> separated;

    @Override
    public String toString() {
        return "OnlineGet{" +
                "total=" + total +
                ", separated=" + separated +
                '}';
    }
}
