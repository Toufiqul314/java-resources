
public class SavingAccount extends Account {

    private double withdrawalLimit;

    public SavingAccount(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public SavingAccount(double withdrawalLimit, int accountNumber, double availableBalance, double totalBalance) {
        super(accountNumber, availableBalance, totalBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SavingAccount{");
        sb.append("withdrawalLimit=").append(withdrawalLimit);
        sb.append('}');
        return sb.toString();
    }

}
