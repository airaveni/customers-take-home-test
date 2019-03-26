package nobaddays.customers;

import nobaddays.customers.pojo.GPSCoordinate;

public class Constants {

    private Constants() {
    }

    static final String JSON_TXT_FILE_DEFAULT_INPUT_URL = "https://s3.amazonaws.com/intercom-take-home-test/customers.txt";
    public static final String JSON_TXT_FILE_ENCODING = "UTF-8";

    public static final String JSON_CUSTOMER_USER_ID_STRING = "user_id";
    public static final String JSON_CUSTOMER_NAME_STRING = "name";
    public static final String JSON_CUSTOMER_LATITUDE_STRING = "latitude";
    public static final String JSON_CUSTOMER_LONGITUDE_STRING = "longitude";

    public static final GPSCoordinate officeLocation = new GPSCoordinate(53.339428,-6.257664);

    // The GPS coordinates for our Dublin office are 53.339428, -6.257664.

}
