package Final.Exception;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Bank {
    private int balance;

    // Constructor
    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }
    // task2: Write the withdraw method
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal of " + amount);
        }
        balance -= amount;
    }
    // Main method to test the Bank class
    public static void main(String[] args) {
        Bank myAccount = new Bank(5000);
        try {
            myAccount.withdraw(6000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed.");
        }
    }
}
