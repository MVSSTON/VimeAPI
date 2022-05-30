package me.mstn.vimeworld.api.method;

import me.mstn.vimeworld.api.method.impl.online.OnlineGetMethod;
import me.mstn.vimeworld.api.method.impl.online.StaffMethod;
import me.mstn.vimeworld.api.method.impl.online.StreamsMethod;

public class OnlineMethods {

    private String token;

    public OnlineMethods() {}

    public OnlineMethods(String token) {
        this.token = token;
    }

    public OnlineGetMethod get() {
        OnlineGetMethod method;

        if (token == null)
            method = new OnlineGetMethod();
        else
            method = new OnlineGetMethod(token);

        return method;
    }

    public StreamsMethod streams() {
        StreamsMethod method;

        if (token == null)
            method = new StreamsMethod();
        else
            method = new StreamsMethod(token);

        return method;
    }

    public StaffMethod staff() {
        StaffMethod method;

        if (token == null)
            method = new StaffMethod();
        else
            method = new StaffMethod(token);

        return method;
    }

}
