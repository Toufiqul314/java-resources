
class Customer {

    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;

    public Customer() {
    }

    public Customer(Address address, String email, String name, String phone, CustomerStatus status) {
        this.address = address;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.status = status;
    }

    boolean makeTransaction(Transaction transaction) {
        // Transaction Logic
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{");
        sb.append("name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

}
