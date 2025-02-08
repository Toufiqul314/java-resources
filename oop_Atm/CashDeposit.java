
class CashDeposit extends Deposit {

    private double cashDepositLimit;

    public CashDeposit() {
    }

    public CashDeposit(double cashDepositLimit) {
        this.cashDepositLimit = cashDepositLimit;
    }

    public double getCashDepositLimit() {
        return cashDepositLimit;
    }

    public void setCashDepositLimit(double cashDepositLimit) {
        this.cashDepositLimit = cashDepositLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CashDeposit{");
        sb.append("cashDepositLimit=").append(cashDepositLimit);
        sb.append('}');
        return sb.toString();
    }

}
