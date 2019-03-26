package nobaddays.customers;

import nobaddays.customers.pojo.Customer;
import nobaddays.customers.utils.CustomerUtils;
import nobaddays.customers.utils.FileReader;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class CustomersApplication {

	public static void main(String[] args) throws IOException, JSONException {
		SpringApplication.run(CustomersApplication.class, args);
		List<Customer> customers = FileReader.getCustomers(new URL(Constants.JSON_TXT_FILE_DEFAULT_INPUT_URL).openStream());

		List<Customer> customersInRange = CustomerUtils.getCustomersWithinDistance(
				customers, Constants.OFFICE_GPS_COORDINATE, Constants.RANGE_TO_CHECK_IN_KM);

		System.out.println("Total " + customers.size());
		System.out.println("Total in range " + customersInRange.size());

		System.out.println(customersInRange);

	}



}
