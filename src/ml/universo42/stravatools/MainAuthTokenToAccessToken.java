package ml.universo42.stravatools;

import com.google.gson.Gson;
import jdk.nashorn.internal.runtime.ParserException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class MainAuthTokenToAccessToken {

    public static void main(String[] args) {
        HttpClient client = new HttpClient();
        Gson gson = new Gson();

        String url = "https://www.strava.com/oauth/token?client_id=REPLACE_CLIENT_ID&client_secret=REPLACE_CLIENT_SECRET&code=REPLACE_AUTH_TOKEN&grant_type=authorization_code"
                .replace("REPLACE_CLIENT_ID", Config.CLIENT_ID.toString())
                .replace("REPLACE_CLIENT_SECRET", Config.CLIENT_SECRET)
                .replace("REPLACE_AUTH_TOKEN", Config.getAuthToken());

        System.out.println("<-> Request : " + url);

        String json = client.post(result -> result, url, null);

        System.out.println("<-> Response: " + json);

        TokenResponse resp = gson.fromJson(json, TokenResponse.class);

        System.out.println("\n<-> Access Token: " + resp.getAccess_token());
    }

}

class TokenResponse {
    private String access_token;

    String getAccess_token() {
        return this.access_token;
    }
}

class HttpClient {

    private HttpClientContext context = HttpClientContext.create();
    private org.apache.http.client.HttpClient httpclient = HttpClients.createDefault();

    public <T> T get(Parser<String, T> parser, URI uri) {
        try {
            HttpResponse response = httpclient.execute(new HttpGet(uri));

            return parser.parse(EntityUtils.toString(response.getEntity()));
        } catch(IOException | ParserException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T get(Parser<String, T> parser, String uri) {
        return get(parser, uri, null);
    }

    public <T> T get(Parser<String, T> parser, String uri, Map<String, String> queryParams) {
        try {
            URIBuilder uriBuilder = new URIBuilder(uri);

            if (queryParams != null) {
                queryParams.entrySet().forEach(e -> uriBuilder.addParameter(e.getKey(), e.getValue()));
            }

            return get(parser, uriBuilder.build());
        } catch(URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T post(Parser<String, T> parser, String uri, String data) {
        try {
            HttpPost request = new HttpPost(uri);

            if (data != null) {
                request.setEntity(new StringEntity(data));
            }

            HttpResponse response = httpclient.execute(request);

            return parser.parse(EntityUtils.toString(response.getEntity()));
        } catch(IOException | ParserException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T request(Parser<String, T> parser, String scheme, String method, String host, int port, String path) {
        HttpRequest request = getRequest(method, path);
        HttpHost httpHost = getHost(host, port, scheme);

        try {
            HttpResponse response = httpclient.execute(httpHost, request, context);

            return parser.parse(EntityUtils.toString(response.getEntity()));
        } catch(IOException | ParserException e) {
            throw new RuntimeException(e);
        }
    }

    private HttpRequest getRequest(String method, String path) {
        return new BasicHttpRequest(method, path);
    }

    private HttpHost getHost(String host, int port, String scheme) {
        return new HttpHost(host, port, scheme);
    }

}

interface Parser<T, R> {

    public R parse(T str);

}

