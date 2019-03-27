package nobaddays.customers.utils;

import nobaddays.customers.pojo.Customer;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FileReaderTest {

    @Test
    public void getCustomers() {

        List<JSONObject> customerJsonObjects = new ArrayList<>();

        try {
            customerJsonObjects.add(new JSONObject("{\"latitude\": \"53.4692815\", \"user_id\": 7, \"name\": \"Frank Kehoe\", \"longitude\": \"-9.436036\"}"));
            customerJsonObjects.add(new JSONObject("{\"latitude\": \"54.080556\", \"user_id\": 23, \"name\": \"Eoin Gallagher\", \"longitude\": \"-6.361944\"}"));
            customerJsonObjects.add(new JSONObject("{\"latitude\": \"53.521111\", \"user_id\": 20, \"name\": \"Enid Enright\", \"longitude\": \"-9.831111\"}"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        List<Customer> customers = FileReader.getCustomersListFromJsonList(customerJsonObjects);

        assert (customers.size() == 3);
        assert (customers.get(0).getUserId() == 7);
        assert (customers.get(1).getName().equals("Eoin Gallagher"));
        assert (Double.compare(53.521111d, customers.get(2).getLocation().getLatitude()) == 0d );
        assert (Double.compare(-9.831111d, customers.get(2).getLocation().getLongitude()) == 0d );

    }
}