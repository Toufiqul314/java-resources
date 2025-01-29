
public class Address {

    private String houseNo;
    private String city;
    private String state;
    private String country;

    public Address() {
    }

    public Address(String houseNo, String city, String state, String country) {
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
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
        sb.append("houseNo=").append(houseNo);
        sb.append(", city=").append(city);
        sb.append(", state=").append(state);
        sb.append(", country=").append(country);
        sb.append('}');
        return sb.toString();
    }

}
