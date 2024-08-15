// File: Main.java
import Balance.code2Account;

public class code2Main {
    public static void main(String[] args) {
        code2Account acc = new code2Account(1000); // Example initial balance
        acc.displayBalance();

        acc.deposit(500);
        acc.displayBalance();

        acc.withdraw(200);
        acc.displayBalance();

        acc.withdraw(2000); // Attempting to withdraw more than the balance
    }
}
