package me.mstn.vimeworld.api.method.impl.match;

import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.match.Match;

public class MatchListMethod extends VimeMethod<Match[]> {

    private long before;
    private long after;
    private int count;

    public MatchListMethod() {
        super();
    }

    public MatchListMethod(String token) {
        super(token);
    }

    public MatchListMethod before(long before) {
        return addParam("before", before);
    }

    public MatchListMethod after(long after) {
        return addParam("after", after);
    }

    public MatchListMethod count(int count) {
        return addParam("count", count);
    }

    @Override
    public MatchListMethod addParam(String key, Object value) {
        return (MatchListMethod) super.addParam(key, value);
    }

    @Override
    public Class<Match[]> getResponseType() {
        return Match[].class;
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "match/list";
    }

}