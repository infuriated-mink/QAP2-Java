package Task3;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method to represent Address as a String
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
