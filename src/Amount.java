public class Amount {
    private double amount;
    private TransactionType transactionType;

    // Constructor
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    // Method to display transaction details
    public void displayTransaction() {
        System.out.println(transactionType + ": " + amount);
    }
}
