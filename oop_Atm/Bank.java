
import java.util.ArrayList;
import java.util.List;

public class Bank {

    String name;
    String bankCode;
    List<ATM> atms = new ArrayList<>();

    void addATM(ATM atm) {
        atms.add(atm);
    }
}
