import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    // Constructor to initialize account and balance to 0.0
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            Amount deposit = new Amount(amount, TransactionType.DEPOSIT);
            transactions.add(deposit);
            balance += amount;
            System.out.println("Deposit successful. Amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            Amount withdrawal = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawal);
            balance -= amount;
            System.out.println("Withdrawal successful. Amount: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to print transaction history
    public void printTransactionHistory() {
        System.out.println("Transaction History for account " + accountNumber + ":");
        for (Amount transaction : transactions) {
            transaction.displayTransaction();
        }
    }

    // Method to retrieve the current balance
    public double getBalance() {
        return balance;
    }

    // Method to retrieve the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to retrieve the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }
}
