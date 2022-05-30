package me.mstn.vimeworld.api.object;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class Error {

    @Getter
    @SerializedName("error_code")
    private int errorCode;

    @Getter
    @SerializedName("error_msg")
    private String errorMessage;

    @Override
    public String toString() {
        return "Error{" +
                "errorCode=" + errorCode +
                ", errorMessage=" + errorMessage +
                "}";
    }

}
