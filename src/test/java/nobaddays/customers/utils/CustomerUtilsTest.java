package nobaddays.customers.utils;

import nobaddays.customers.pojo.Customer;
import nobaddays.customers.pojo.GPSCoordinate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerUtilsTest {

    @Test
    public void getCustomersWithinDistance() {

        List<Customer> customersToFilter = new ArrayList<>();
        customersToFilter.add(new Customer(2, "Adam", new GPSCoordinate(53.2451022d,-6.238335d)));
        customersToFilter.add(new Customer(8, "Dave", new GPSCoordinate(55.033d,-8.112d)));
        customersToFilter.add(new Customer(4, "Beth", new GPSCoordinate(53d,-7d)));
        customersToFilter.add(new Customer(6, "Chad", new GPSCoordinate(51.92893d,-10.27699d)));

        GPSCoordinate filterLocation = new GPSCoordinate(53.339428,-6.257664);

        Double kilometerRange = 100d;

        List<Customer> customersInRange = CustomerUtils.getCustomersWithinDistance(customersToFilter, filterLocation, kilometerRange);

        assert (customersInRange.size() == 2);
        assert (customersInRange.get(0).getUserId() == 2);
        assert (customersInRange.get(1).getUserId() == 4);

    }
}