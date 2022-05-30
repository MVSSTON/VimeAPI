package me.mstn.vimeworld.api.method;

public class VimeApiMethods {

    /**
     * Адрес точки приёма запросов на стороне сервера
     * */
    public static final String API_ENDPOINT = "https://api.vimeworld.com/";

    public MatchMethods match() {
        return new MatchMethods();
    }

    public MatchMethods match(String token) {
        return new MatchMethods(token);
    }

    public UserMethods user() {
        return new UserMethods();
    }

    public UserMethods user(String token) {
        return new UserMethods(token);
    }

    public GuildMethods guild() {
        return new GuildMethods();
    }

    public GuildMethods guild(String token) {
        return new GuildMethods(token);
    }

    public OnlineMethods online() {
        return new OnlineMethods();
    }

    public OnlineMethods online(String token) {
        return new OnlineMethods(token);
    }

    public LeaderboardMethods leaderboard() {
        return new LeaderboardMethods();
    }

    public LeaderboardMethods leaderboard(String token) {
        return new LeaderboardMethods(token);
    }

    public LocaleMethods locale() {
        return new LocaleMethods();
    }

    public LocaleMethods locale(String token) {
        return new LocaleMethods(token);
    }

    public MiscMethods misc() {
        return new MiscMethods();
    }

    public MiscMethods misc(String token) {
        return new MiscMethods(token);
    }

}
