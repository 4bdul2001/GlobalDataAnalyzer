package WbApi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WbApiModel implements IWbApiModel {

    private String urlString;

    public Response getData(Request request) throws WbApiModelException {
        this.urlString =
                String.format(
                        "http://api.worldbank.org/v2/country/%s/indicator/%s?date=%s:%s&format=json",
                        request.getCountry(), request.getIndicatorID(),
                        request.getYearFrom(), request.getYearTo()
                );
        Response r = new Response(this.callAPI());
        return r;
    }

    private String callAPI() throws WbApiModelException {
        try {
            URL url = new URL(this.urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            String inline = "";
            if (responseCode == 200) {
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
                sc.close();
            }
            return inline;
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new WbApiModelException("API call failed");
    }

    public class WbApiModelException extends Exception {
        public WbApiModelException(String message) {
            super(message);
        }
    }
}