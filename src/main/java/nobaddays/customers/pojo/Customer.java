package nobaddays.customers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private int userId;
    private String name;
    private GPSCoordinate location;

    @Override
    public String toString(){
        return "user_id: " + userId +
                ", name: " + name;
    }

}
