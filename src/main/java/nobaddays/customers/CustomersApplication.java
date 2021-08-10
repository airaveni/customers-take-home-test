package nobaddays.customers;

import nobaddays.customers.utils.CustomerUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomersApplication {

	public static void main(String[] args){
        SpringApplication.run(CustomersApplication.class, args);
        // if args[0] is set, use it as the range to search within.
        final double validRange = args.length > 0 ? Double.parseDouble(args[0]) : Constants.DEFAULT_VALID_RANGE_IN_KM;
        // if args[1] is set, use it as the json.txt url.
        final String fileUrl = args.length > 1 ? args[1] : Constants.DEFAULT_JSON_TXT_FILE_INPUT_URL;



        CustomerUtils.processCustomerData(fileUrl, validRange);

	}

}
