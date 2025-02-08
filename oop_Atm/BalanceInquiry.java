
public class BalanceInquiry extends Transaction {

    private int accountId;

    public BalanceInquiry() {
    }

    double getAccount() {
        return accountId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BalanceInquiry{");
        sb.append("accountId=").append(accountId);
        sb.append('}');
        return sb.toString();
    }
}
