package Class2;

public class BillingAddress implements Addressable{

    int streetNumber;
    String streetName;
    String city;
    String state;

    public BillingAddress(int streetNumber, String streetName, String city, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    @Override
    public String getStreet() {
        return Integer.toString(streetNumber) + " " + streetName;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getState() {
        return state;
    }

    public static void main(String[] args) {
        BillingAddress address = new BillingAddress(1234, "Perkins St.", "Stillwater", "OK");
        System.out.println(address.getFullAddress());
    }
}
