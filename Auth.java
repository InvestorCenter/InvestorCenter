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

    // '/saveProfile/<username>/<income>/<risk>/<monthlyConBool>/<monthlyConAmount>/<timePeriod>'
    public static boolean uploadProfile(String username, int income, int risk, boolean contributeMonthly, int timePeriod, int monthlyAmount) {
        String strUrl;
        try {
            // Convert the parameters to strings and URL encode them
            String encodedUsername = URLEncoder.encode(username, "UTF-8");
            String encodedIncome = URLEncoder.encode(String.valueOf(income), "UTF-8");
            String encodedRisk = URLEncoder.encode(String.valueOf(risk), "UTF-8");
            String encodedContributeMonthly = URLEncoder.encode(String.valueOf(contributeMonthly), "UTF-8");
            String encodedMonthlyAmount = URLEncoder.encode(String.valueOf(monthlyAmount), "UTF-8");
            String encodedTimePeriod = URLEncoder.encode(String.valueOf(timePeriod), "UTF-8");

            // Prepare the URL
            strUrl = BASE_ENDPOINT + "saveProfile/" + encodedUsername + "/" + encodedIncome + "/" + encodedRisk + "/" + encodedContributeMonthly + "/" + encodedMonthlyAmount + "/" + encodedTimePeriod;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
        return GetFromApi(strUrl);
    }

    public static boolean CheckIfProfileExists(String username) {
        return GetFromApi(BASE_ENDPOINT + "checkProfile/" + username);
    }

    public static int getUserRisk(String username) {
       return GetValueFromApi(BASE_ENDPOINT + "getUserRisk/" + username);
    }

    public static int getUserContributeMonthly(String username) {
        return GetValueFromApi(BASE_ENDPOINT + "getUserContributeMonthly/" + username);
    }

    public static int getUserMonthlyAmount(String username) {
        return GetValueFromApi(BASE_ENDPOINT + "getUserMonthlyAmount/" + username);
    }

    public static int getUserTimePeriod(String username) {
        return GetValueFromApi(BASE_ENDPOINT + "getUserTimePeriod/" + username);
    }


    public static int getUserIncome(String username) {
        return GetValueFromApi(BASE_ENDPOINT + "getUserIncome/" + username);
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

    private static int GetValueFromApi(String strUrl) {
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
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }


        try {
            return Integer.parseInt(response.toString().trim());
        } catch (NumberFormatException e) {
            System.err.println("The response cannot be parsed to an integer: " + response);
        }

        return 0;
    }
}
