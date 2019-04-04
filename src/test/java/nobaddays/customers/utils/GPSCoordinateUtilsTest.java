package nobaddays.customers.utils;

import nobaddays.customers.pojo.GPSCoordinate;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GPSCoordinateUtilsTest {

    @Test
    public void getDistanceInKm() {
        GPSCoordinate location1 = new GPSCoordinate(200d, -300d);
        GPSCoordinate location2 = new GPSCoordinate(-500d, 100d);
        Double expectedDistance = 4395.644069312897d;

        assertEquals(0, expectedDistance.compareTo(GPSCoordinateUtils.getDistanceInKm(location1,location2)));

    }

}