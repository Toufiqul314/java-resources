
import java.util.Date;

class Transaction {

    private int transactionId;
    private TransactionStatus status;
    private Date creationDate;

    public Transaction() {
    }

    public Transaction(Date creationDate, TransactionStatus status, int transactionId) {
        this.creationDate = creationDate;
        this.status = status;
        this.transactionId = transactionId;
    }

    boolean saveTransaction() {
        // Transaction Logic
        return true;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", status=" + status + ", creationDate=" + creationDate
                + "]";
    }
    
}
