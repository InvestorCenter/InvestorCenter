import java.net.*;
import java.io.*;

public class Auth {

    private static final String BASE_ENDPOINT = "https://chrisbolton.pythonanywhere.com/";
    private static final String SUCCESS_MESSAGE = "success";

    public static boolean CheckUser(String username, String password) {
        String strUrl = BASE_ENDPOINT + "check/" + username + "/" + password;
        return GetFromApi(strUrl);
    }

    public static boolean Signup(String username, String password) {
        String strUrl = BASE_ENDPOINT + "signup/" + username + "/" + password;
        return GetFromApi(strUrl);
    }

    private static boolean GetFromApi(String strUrl) {
        HttpURLConnection connection = null;
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(strUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line + '\r');
            }
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return response.toString().contains(SUCCESS_MESSAGE);
    }

}