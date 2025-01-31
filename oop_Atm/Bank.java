
import java.util.ArrayList;
import java.util.List;

public class Bank {

    String name;
    String bankCode;
    List<ATM> atms = new ArrayList<>();

    public Bank() {
    }

    public Bank(String bankCode, String name) {
        this.bankCode = bankCode;
        this.name = name;
    }

    void addATM(ATM atm) {
        atms.add(atm);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public List<ATM> getAtms() {
        return atms;
    }

    @Override
    public String toString() {
        return "Bank [name=" + name + ", bankCode=" + bankCode + ", atms=" + atms + "]";
    }

    public void setAtms(List<ATM> atms) {
        this.atms = atms;
    }
}
