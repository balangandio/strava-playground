package ml.universo42.stravatools;

public class MainUserAuthToken {

    public static void main(String[] args) {
        String userAuthUrl = "http://www.strava.com/oauth/authorize?client_id=REPLACE_WITH_CLIENT_ID&response_type=code&redirect_uri=http://localhost/exchange_token&approval_prompt=force&scope=REPLACE_WITH_SCOPE";

        System.out.println("<-> URL: " + userAuthUrl
                .replace("REPLACE_WITH_CLIENT_ID", Config.CLIENT_ID.toString())
                .replace("REPLACE_WITH_SCOPE", Config.REQUIRED_ACCESS));
    }

}
