package me.mstn.vimeworld.api.method.impl.guild;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.guild.Guild;

public class GuildSearchMethod extends VimeMethod<Guild.InUser[]> {

    public GuildSearchMethod() {
        super();
    }

    public GuildSearchMethod(String token) {
        super(token);
    }

    public GuildSearchMethod query(String query) {
        return addParam("query", query);
    }

    @Override
    public GuildSearchMethod addParam(String key, Object value) {
        return (GuildSearchMethod) super.addParam(key, value);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "guild/search";
    }

    @Override
    public Class<Guild.InUser[]> getResponseType() {
        return Guild.InUser[].class;
    }

}
