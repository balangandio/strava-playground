# Strava playground
Playing with Strava API.

# Install
Run `mvn clean install` on `generated/java` directory to install Strava API on your local repository.

# Setup
Fill `CLIENT_ID`, `CLIENT_SECRET` and `REQUIRED_ACCESS` with your Strava client settings.

Run `MainUserAuthToken` to build the user authorization URL. The result code goes to `AUTHORIZATION_TOKEN` var. 

Run `MainAuthTokenToAccessToken` to convert the authorization token to an access token. The result code goes to `ACCESS_TOKEN`.

# Update
Run `java -jar swagger-codegen-cli.jar generate -i https://developers.strava.com/swagger/swagger.json -l java -o generated/java` 