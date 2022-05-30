package me.mstn.vimeworld.api.method.impl.match;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.match.MatchById;

public class MatchByIdMethod extends VimeMethod<MatchById> {

    private long id;

    public MatchByIdMethod() {
        super();
    }

    public MatchByIdMethod(String token) {
        super(token);
    }

    public MatchByIdMethod id(long id) {
        this.id = id;
        return this;
    }

    @Override
    public Class<MatchById> getResponseType() {
        return MatchById.class;
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "match/" + id;
    }

}
