
import java.util.Date;


class Transfer extends Transaction {

    private int destinationAccountNumber;
    private int sourceAccountNumber;
    private double amount;

    public Transfer(double amount, int destinationAccountNumber, int sourceAccountNumber) {
        this.amount = amount;
        this.destinationAccountNumber = destinationAccountNumber;
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public Transfer(double amount, int destinationAccountNumber, int sourceAccountNumber, Date creationDate, TransactionStatus status, int transactionId) {
        super(creationDate, status, transactionId);
        this.amount = amount;
        this.destinationAccountNumber = destinationAccountNumber;
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public int getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    public void setDestinationAccountNumber(int destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }

    public int getSourceAccountNumber() {
        return sourceAccountNumber;
    }

    public void setSourceAccountNumber(int sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transfer{");
        sb.append("destinationAccountNumber=").append(destinationAccountNumber);
        sb.append(", sourceAccountNumber=").append(sourceAccountNumber);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }

    
}
