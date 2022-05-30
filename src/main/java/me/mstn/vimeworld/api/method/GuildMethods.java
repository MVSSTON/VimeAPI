package me.mstn.vimeworld.api.method;

import me.mstn.vimeworld.api.method.impl.guild.GuildGetMethod;
import me.mstn.vimeworld.api.method.impl.guild.GuildSearchMethod;

public class GuildMethods {

    private String token;

    public GuildMethods() {}

    public GuildMethods(String token) {
        this.token = token;
    }

    public GuildSearchMethod search() {
        GuildSearchMethod method;

        if (token == null)
            method = new GuildSearchMethod();
        else
            method = new GuildSearchMethod(token);

        return method;
    }

    public GuildGetMethod get() {
        GuildGetMethod method;

        if (token == null)
            method = new GuildGetMethod();
        else
            method = new GuildGetMethod(token);

        return method;
    }

}
