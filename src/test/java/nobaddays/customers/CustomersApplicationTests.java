package nobaddays.customers;

import nobaddays.customers.pojo.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomersApplicationTests {

	@Test
	public void processCustomerData() {

		List<Customer> customers = CustomersApplication.processCustomerData(Constants.DEFAULT_JSON_TXT_FILE_INPUT_URL, Constants.DEFAULT_VALID_RANGE_IN_KM);

		assert (customers.get(0).getName().equals("Ian Kehoe"));
		assert (customers.get(4).getUserId() == 11);

	}

}
