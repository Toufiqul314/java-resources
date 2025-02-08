
class CheckingAccount extends Account {

    private String debitCardNumber;

    public CheckingAccount(String debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

    public CheckingAccount(String debitCardNumber, int accountNumber, double availableBalance, double totalBalance) {
        super(accountNumber, availableBalance, totalBalance);
        this.debitCardNumber = debitCardNumber;
    }

    public String getDebitCardNumber() {
        return debitCardNumber;
    }

    public void setDebitCardNumber(String debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

}
