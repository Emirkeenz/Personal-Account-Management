public class Main {
    public static void main(String[] args) {
        // Create a personal account
        PersonalAccount account = new PersonalAccount(12345, "John Doe");

        // Deposit money
        account.deposit(500.0);
        account.deposit(300.0);

        // Withdraw money
        account.withdraw(200.0);

        // Print balance
        System.out.println("Current balance: " + account.getBalance());

        // Print transaction history
        account.printTransactionHistory();
    }
}
