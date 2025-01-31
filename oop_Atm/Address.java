
public class Address {

    String streetAddress;
    String city;
    String state;
    String zipcode;
    String country;

    public Address() {
    }

    public Address(String city, String country, String state, String streetAddress, String zipcode) {
        this.city = city;
        this.country = country;
        this.state = state;
        this.streetAddress = streetAddress;
        this.zipcode = zipcode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append("streetAddress=").append(streetAddress);
        sb.append(", city=").append(city);
        sb.append(", state=").append(state);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", country=").append(country);
        sb.append('}');
        return sb.toString();
    }

}
