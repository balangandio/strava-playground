package ml.universo42.stravatools;

public class Config {

    public static final Integer CLIENT_ID = 33733;
    public static final String CLIENT_SECRET = "fb12853b901e864d148146b42e8d8fde02985fed";
    public static final String REQUIRED_ACCESS = "read,activity:write,activity:read";


    public static final String AUTHORIZATION_TOKEN = "432718b8c1dc497915e045d18ab26944353478a0";
    public static final String ACCESS_TOKEN = "0e3d5384597fa2f2122ee526f2bb2b684ba1c81c";

    public static String getAuthToken() {
        return AUTHORIZATION_TOKEN;
    }

}
