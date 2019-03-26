package nobaddays.customers.pojo;

import java.util.Comparator;

public class Customer /*implements Comparator<Customer> */{

    private String userId;
    private String name;
    private GPSCoordinate location;

    public Customer(String userId, String name, GPSCoordinate location) {
        this.userId = userId;
        this.name = name;
        this.location = location;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GPSCoordinate getLocation() {
        return location;
    }

    public void setLocation(GPSCoordinate location) {
        this.location = location;
    }

    @Override
    public String toString(){
        return "user_id: " + userId +
                ", name: " + name +
                ", location: ( " + location + " )";
    }
/*
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.userId - o2.userId;
    }*/
}
