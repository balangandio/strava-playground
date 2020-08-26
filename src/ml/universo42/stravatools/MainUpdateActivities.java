package ml.universo42.stravatools;

import com.google.gson.Gson;
import io.swagger.client.ApiException;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUpdateActivities {

    private static File OUTPUT_FILE = new File("C:\\Tmp\\strava.json");


    public static void main(String[] args) throws ApiException, IOException {
        Api api = Api.build(Config.ACCESS_TOKEN);

        String json = readFile(OUTPUT_FILE);

        Map<String, String> map = GSON.fromJson(json, Map.class);

        List<Map.Entry<String, String>> list = map.entrySet().stream().collect(Collectors.toList());

        for (Map.Entry<String, String> entry : list) {
            String newName = entry.getValue().replace("Passeio", "Ride");

            api.updateActivityName(Long.valueOf(entry.getKey()), newName);

            System.out.println("<-> Updated: " + newName);

            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        System.out.println("<-> Total: " + list.size());
    }

    private static String readFile(File file) throws IOException {
        InputStream in = new FileInputStream(file);

        try {
            return new BufferedReader(new InputStreamReader(in)).lines().collect(Collectors.joining("\n"));
        } finally {
            in.close();
        }
    }

    private static Gson GSON = new Gson();

}
