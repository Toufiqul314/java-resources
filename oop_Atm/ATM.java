
class ATM {

    int atmID;
    Address location;

    public ATM() {
    }

    public ATM(int atmID, Address location) {
        this.atmID = atmID;
        this.location = location;
    }

    boolean authenticateUser() {
        // Authentication Logic
        return true;
    }

    public int getAtmID() {
        return atmID;
    }

    public void setAtmID(int atmID) {
        this.atmID = atmID;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
}
