class BankAccount {
    // Fields
    String accountHolder;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object
        BankAccount myAccount = new BankAccount();

        // Set fields
        myAccount.accountHolder = "James Emou";
        myAccount.balance = 1500.0;

        // Call methods
        myAccount.deposit(500.0); // Output: "500.0 deposited. New balance: 1500.0"
        myAccount.withdraw(400.0); // Output: "200.0 withdrawn. Remaining balance: 1300.0"
    }
}