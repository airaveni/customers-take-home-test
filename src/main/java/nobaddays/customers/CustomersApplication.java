package nobaddays.customers;

import nobaddays.customers.pojo.Customer;
import nobaddays.customers.pojo.GPSCoordinate;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CustomersApplication {

	public static void main(String[] args) throws IOException, JSONException {
		SpringApplication.run(CustomersApplication.class, args);
		List<JSONObject> json = readJsonFromUrl(Consents.DEFAULT_JSON_TXT_INPUT_URL);


		List<Customer> customers = new ArrayList<>();

		System.out.println("==========================");
		for(JSONObject jsonObject: json){
			GPSCoordinate location = new GPSCoordinate(
					Double.parseDouble(jsonObject.get("longitude").toString()),
					Double.parseDouble(jsonObject.get("longitude").toString()));
			Customer customer = new Customer(
					jsonObject.get("user_id").toString(),
					jsonObject.get("name").toString(),
					location
			);
			customers.add(customer);

			System.out.println(customer);
		}

		System.out.println("Total " + customers.size());

	}

	private static List<JSONObject> readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();

		List<JSONObject> customers;
		try (BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")))) {
			customers = new ArrayList<>();
			String line;
			while ((line = rd.readLine()) != null) {
				customers.add(new JSONObject(line));
			}
		}
		return customers;
	}
	
}
