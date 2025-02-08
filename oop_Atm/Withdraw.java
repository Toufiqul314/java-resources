
import java.util.Date;


class Withdraw extends Transaction {

    private double amount;

    public Withdraw(double amount) {
        this.amount = amount;
    }

    public Withdraw(double amount, Date creationDate, TransactionStatus status, int transactionId) {
        super(creationDate, status, transactionId);
        this.amount = amount;
    }

    int getAmount() {
        return (int) amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Withdraw{");
        sb.append("amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
