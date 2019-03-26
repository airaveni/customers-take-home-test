package nobaddays.customers.utils;

import nobaddays.customers.pojo.Customer;
import nobaddays.customers.pojo.GPSCoordinate;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileReader {


    public static List<Customer> getCustomers(InputStream inputStream) throws IOException, JSONException {

        List<JSONObject> customers;
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")))) {
            customers = new ArrayList<>();
            String line;
            while ((line = rd.readLine()) != null) {
                customers.add(new JSONObject(line));
            }
        }

        return getCustomersListFromJsonList(customers);
    }

    private static List<Customer> getCustomersListFromJsonList(List<JSONObject> customerJsonObjects){
        List<Customer> customers = new ArrayList<>();
        for(JSONObject jsonObject: customerJsonObjects){
            GPSCoordinate location = new GPSCoordinate(
                    Double.parseDouble(jsonObject.get("longitude").toString()),
                    Double.parseDouble(jsonObject.get("longitude").toString()));
            Customer customer = new Customer(
                    jsonObject.get("user_id").toString(),
                    jsonObject.get("name").toString(),
                    location
            );
            customers.add(customer);
        }

        return customers;
    }

}
