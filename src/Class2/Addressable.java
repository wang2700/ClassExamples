package Class2;

public interface Addressable {

    String COUNTRY = "USA";

    String getStreet();
    String getCity();
    String getState();

    default String getFullAddress() {
        return getStreet() + "," + getCity() + "," + getState() + "," + "USA ";
    }
}
