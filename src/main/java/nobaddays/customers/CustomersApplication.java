package nobaddays.customers;

import nobaddays.customers.pojo.Customer;
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
		List<Customer> customers = FileReader.getCustomers(new URL(Consents.DEFAULT_JSON_TXT_INPUT_URL).openStream());

		System.out.println("Total " + customers.size());

	}

}
