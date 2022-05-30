package me.mstn.vimeworld.api.method.impl.guild;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.guild.Guild;

public class GuildGetMethod extends VimeMethod<Guild.Full> {

    public GuildGetMethod() {
        super();
    }

    public GuildGetMethod(String token) {
        super(token);
    }

    public GuildGetMethod id(int id) {
        return addParam("id", id);
    }

    public GuildGetMethod name(String name) {
        return addParam("name", name);
    }

    public GuildGetMethod tag(String tag) {
        return addParam("tag", tag);
    }

    public GuildGetMethod unsafe() {
        return addParam("unsafe", "true");
    }

    @Override
    public GuildGetMethod addParam(String key, Object value) {
        return (GuildGetMethod) super.addParam(key, value);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "guild/get";
    }

    @Override
    public Class<Guild.Full> getResponseType() {
        return Guild.Full.class;
    }

}
