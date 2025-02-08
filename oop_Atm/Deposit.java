
class Deposit extends Transaction {

   private  double amount;

    public Deposit() {
    }

    public Deposit(double amount) {
        this.amount = amount;
    }

   private  int getAmount() {
        return (int) amount;
    }
    
}
