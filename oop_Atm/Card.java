
import java.util.*;

class Card {

    private String cardNumber;
    private String customerName;
    private Date cardExpiry;
    private int pin;

    public Card() {
    }

    public Card(Date cardExpiry, String cardNumber, String customerName, int pin) {
        this.cardExpiry = cardExpiry;
        this.cardNumber = cardNumber;
        this.customerName = customerName;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(Date cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card{");
        sb.append("cardNumber=").append(cardNumber);
        sb.append(", customerName=").append(customerName);
        sb.append(", cardExpiry=").append(cardExpiry);
        sb.append(", pin=").append(pin);
        sb.append('}');
        return sb.toString();
    }

}
