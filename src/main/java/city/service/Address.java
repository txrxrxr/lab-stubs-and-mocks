package city.service;

/**
 * Contains an address for each employee.
 */
public class Address {
    String address;
    String city;

    public Address(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }
}
