package ml.universo42.stravatools;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ActivitiesApi;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.DetailedActivity;
import io.swagger.client.model.SummaryActivity;
import io.swagger.client.model.UpdatableActivity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Api {

    private ApiClient client;
    private ActivitiesApi activitiesApi;

    private Api(ApiClient client) {
        this.client = client;
        this.activitiesApi = new ActivitiesApi(client);
    }

    public static Api build(String accessToken) {
        ApiClient client = new ApiClient();

        OAuth strava_oauth = (OAuth) client.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken(accessToken);

        return new Api(client);
    }

    public List<SummaryActivity> fetchActivities(LocalDateTime start, LocalDateTime end) throws ApiException {
        int currentPage = 0, total = 0, perPage = 200, maxPages = 1000;

        List<SummaryActivity> activities = new ArrayList<>();

        do {
            currentPage++;

            List<SummaryActivity> pageActivities = fetchActivities(start, end, currentPage, perPage);

            total = pageActivities.size();

            activities.addAll(pageActivities);
        } while(total == perPage && currentPage < maxPages);

        return activities;
    }

    public DetailedActivity updateActivityName(Long activityId, String newName) throws ApiException {
        UpdatableActivity body = new UpdatableActivity();
        body.setName(newName);

        return this.activitiesApi.updateActivityById(activityId, body);
    }

    private List<SummaryActivity> fetchActivities(LocalDateTime start, LocalDateTime end, int page, int perPage) throws ApiException {
        return this.activitiesApi.getLoggedInAthleteActivities(
                (int)(end.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() / 1000),
                (int)(start.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() / 1000),
                page,
                perPage
        );
    }

}
