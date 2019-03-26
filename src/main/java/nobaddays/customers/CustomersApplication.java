package nobaddays.customers;

import nobaddays.customers.pojo.Customer;
import nobaddays.customers.pojo.GPSCoordinate;
import nobaddays.customers.utils.FileReader;
import nobaddays.customers.utils.GPSCoordinateUtils;
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

		System.out.println("====== Distance From Office =======");

		for(Customer customer: customers){

			double distance = GPSCoordinateUtils.getDistanceInKm(customer.getLocation(),	Constants.officeLocation);
			System.out.println(distance);

		}

		System.out.println("Total " + customers.size());
		System.out.println(customers);

	}



}
