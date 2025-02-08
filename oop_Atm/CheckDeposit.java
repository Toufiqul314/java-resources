
class CheckDeposit extends Deposit {

    private String checkNumber;
    private String bankCode;

    public CheckDeposit() {
    }

    public CheckDeposit(String bankCode, String checkNumber) {
        this.bankCode = bankCode;
        this.checkNumber = checkNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckDeposit{");
        sb.append("checkNumber=").append(checkNumber);
        sb.append(", bankCode=").append(bankCode);
        sb.append('}');
        return sb.toString();
    }

}
