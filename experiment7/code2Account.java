// File: Balance/Account.java
package Balance;

public class code2Account {
    private double balance;

    public code2Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
            System.out.println("Jayant Dev SAP: 500120083");
        }
    }
}
