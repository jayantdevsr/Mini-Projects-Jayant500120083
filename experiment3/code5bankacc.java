// package experiment3;
import java.util.Scanner;

class BankAccount {
    int accno, totalbal;
    String name;

    public void insertData(Scanner sc) {
        System.out.println("Enter the account number:");
        accno = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter the initial amount:");
        totalbal = sc.nextInt();
    }

    public void printArea() {
        System.out.println("Your acc no: " + accno);
        System.out.println("Name of the acc is: " + name);
        System.out.println("Balance is: " + totalbal);
    }

    public void Addbal(Scanner sc) {
        System.out.println("Enter the amount to be deposited:");
        int dep = sc.nextInt();
        totalbal += dep;
        System.out.println("Total balance is: " + totalbal);
    }

    public void WithBal(Scanner sc) {
        System.out.println("Enter the amount to be withdrawn:");
        int withd = sc.nextInt();
        if (totalbal >= withd) {
            totalbal -= withd;
            System.out.println("Withdrawal successful. Remaining balance: " + totalbal);
            System.out.println("Jayant Dev\n500120083");

        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class code5bankacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bacc = new BankAccount();
        bacc.insertData(sc);
        bacc.printArea();
        bacc.Addbal(sc);
        bacc.WithBal(sc);
        sc.close();
    }
}
