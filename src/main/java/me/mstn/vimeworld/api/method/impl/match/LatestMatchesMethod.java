package me.mstn.vimeworld.api.method.impl.match;

import lombok.Getter;
import me.mstn.vimeworld.api.method.VimeApiMethods;
import me.mstn.vimeworld.api.method.impl.VimeMethod;
import me.mstn.vimeworld.api.object.match.Match;

public class LatestMatchesMethod extends VimeMethod<Match[]> {

    @Getter
    private int count = 20;

    public LatestMatchesMethod() {
        super();
    }

    public LatestMatchesMethod(String token) {
        super(token);
    }

    public LatestMatchesMethod setCount(int count) {
        this.count = Math.min(count, 100);
        return addParam("count", this.count);
    }

    @Override
    public Class<Match[]> getResponseType() {
        return Match[].class;
    }

    @Override
    public LatestMatchesMethod addParam(String key, Object value) {
        return (LatestMatchesMethod) super.addParam(key, value);
    }

    @Override
    public String getUrl() {
        return VimeApiMethods.API_ENDPOINT + "match/latest";
    }

}
