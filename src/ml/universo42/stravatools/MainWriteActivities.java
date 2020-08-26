package ml.universo42.stravatools;

import com.google.gson.Gson;
import io.swagger.client.ApiException;
import io.swagger.client.model.SummaryActivity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainWriteActivities {

    private static LocalDateTime START = LocalDateTime.of(2018, 6, 1, 0, 0);
    private static LocalDateTime END   = LocalDateTime.of(2021, 1, 1, 0, 0);
    private static File OUTPUT_FILE = new File("C:\\Tmp\\strava.json");


    public static void main(String[] args) throws ApiException, IOException {
        Api api = Api.build(Config.ACCESS_TOKEN);

        System.out.print("<-> Range      : [" + formatDateTime(Instant.ofEpochMilli(START.atZone(SYS_ZONE).toInstant().toEpochMilli()).atZone(SYS_ZONE).toLocalDateTime()));
        System.out.println("] to [" + formatDateTime(Instant.ofEpochMilli(END.atZone(SYS_ZONE).toInstant().toEpochMilli()).atZone(SYS_ZONE).toLocalDateTime()) + "]");

        List<SummaryActivity> result = api.fetchActivities(START, END);
        Optional<SummaryActivity> min = result.stream().min(ACTIVITY_COMP);
        Optional<SummaryActivity> max = result.stream().max(ACTIVITY_COMP);

        min.ifPresent(minAct -> {
            max.ifPresent(maxAct -> {
                System.out.print("<-> Act Range  : [" + formatDateTime(minAct.getStartDate().toLocalDateTime()));
                System.out.println("] to [" + formatDateTime(maxAct.getStartDate().toLocalDateTime()) + "]");
            });
        });

        System.out.println("<-> Result list: " + result.size());

        List<SummaryActivity> rideActivities = result.stream().filter(act -> act.getName().startsWith("Passeio")).collect(Collectors.toList());

        System.out.println();
        System.out.println("<-> Total rides: " + rideActivities.size());

        Map<String, String> map = rideActivities.stream().collect(Collectors.toMap(act -> act.getId().toString(), act -> act.getName()));

        String json = GSON.toJson(map);

        writeFile(OUTPUT_FILE, json);
        System.out.println("<-> Write out: " + json);
    }

    private static void writeFile(File file, String data) throws IOException {
        FileWriter fw = new FileWriter(file);
        try {
            fw.write(data);
        } finally {
            fw.close();
        }
    }

    private static String formatDateTime(org.threeten.bp.LocalDateTime dateTime) {
        return org.threeten.bp.format.DateTimeFormatter.ofPattern("dd/MM/yy hh:mm").format(dateTime);
    }

    private static String formatDateTime(LocalDateTime dateTime) {
        return DateTimeFormatter.ofPattern("dd/MM/yy hh:mm").format(dateTime);
    }

    private static Comparator<SummaryActivity> ACTIVITY_COMP = (act1, act2) -> act1.getStartDate().compareTo(act2.getStartDate());
    private static ZoneId SYS_ZONE = ZoneId.systemDefault();
    private static Gson GSON = new Gson();

}
