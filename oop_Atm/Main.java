public class Main {
    public static void main(String[] args) {
        Account account = new Account(1234, 5000, 10000);
        System.out.println(account.getAvailableBalance()); // Output: 5000
    }
}
