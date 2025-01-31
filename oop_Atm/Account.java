
class Account {

    private int accountNumber;
    private double totalBalance;
    private double availableBalance;

    public Account() {
    }

    public Account(int accountNumber, double availableBalance, double totalBalance) {
        this.accountNumber = accountNumber;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
    }

    int getAvailableBalance() {
        return (int) availableBalance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", totalBalance=").append(totalBalance);
        sb.append(", availableBalance=").append(availableBalance);
        sb.append('}');
        return sb.toString();
    }
}
