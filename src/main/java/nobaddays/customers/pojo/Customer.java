package nobaddays.customers.pojo;

public class Customer {

    private int userId;
    private String name;
    private GPSCoordinate location;

    public Customer(int userId, String name, GPSCoordinate location) {
        this.userId = userId;
        this.name = name;
        this.location = location;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
                ", name: " + name;
    }

}
