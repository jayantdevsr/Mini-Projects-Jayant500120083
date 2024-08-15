import java.util.*;

// Interface to achieve full abstractin
interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
}

// default class as person
class Person {
    protected String name;
    protected String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

// Class inheritance person to cus
class Customer extends Person implements AccountOperations {
    private String customerId;
    private double balance;
    public ArrayList<SavingsAccount> savingsAccounts;
    public ArrayList<FixedDepositAccount> fixedDepositAccounts;

    public Customer(String name, String address, String customerId) {
        super(name, address);
        this.customerId = customerId;
        balance = 0.0;
        savingsAccounts = new ArrayList<>();
        fixedDepositAccounts = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void openSavingsAccount(double initialDeposit) {
        SavingsAccount account = new SavingsAccount(initialDeposit);
        savingsAccounts.add(account);
        int accnumb = 30430220;
        System.out.println("Savings Account opened with initial deposit $" + initialDeposit);
        System.out.println("Your account number is: "+accnumb);
        accnumb++;
    }

    public void openFixedDepositAccount(double amount, int durationMonths) {
        FixedDepositAccount fdAccount = new FixedDepositAccount(amount, durationMonths);
        fixedDepositAccounts.add(fdAccount);
        System.out.println("Fixed Deposit Account opened with amount $" + amount + " for " + durationMonths + " months.");
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerId() {
        return customerId;
    }

    class SavingsAccount {
        private double balance;

        public SavingsAccount(double initialDeposit) {
            this.balance = initialDeposit;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited into Savings Account: $" + amount);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn from Savings Account: $" + amount);
            } else {
                System.out.println("Insufficient balance in Savings Account!");
            }
        }
    }

    class FixedDepositAccount {
        private double amount;
        private int durationMonths;
        private Date maturityDate;

        public FixedDepositAccount(double amount, int durationMonths) {
            this.amount = amount;
            this.durationMonths = durationMonths;
            calculateMaturityDate();
        }

        private void calculateMaturityDate() {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, durationMonths);
            maturityDate = calendar.getTime();
        }

        public double calculateMaturityAmount(double interestRate) {
            return amount * Math.pow((1 + interestRate / 100), (durationMonths / 12.0));
        }

        public void withdrawAfterMaturity() {
            Date currentDate = new Date();
            if (currentDate.after(maturityDate)) {
                balance += amount;
                System.out.println("Amount withdrawn after maturity: $" + amount);
                amount = 0;
            } else {
                System.out.println("Cannot withdraw before maturity date.");
            }
        }
    }
}

public class BankingManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Banking Management System");

        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter your address: ");
        String customerAddress = sc.nextLine();
        System.out.print("Enter your customer ID: ");
        String customerId = sc.nextLine();

        Customer customer = new Customer(customerName, customerAddress, customerId);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Open Savings Account\n4. Open Fixed Deposit Account\n5. Withdraw from Fixed Deposit Account\n6. Check Balance\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    customer.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    customer.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter initial deposit amount for Savings Account: ");
                    double savingsInitialDeposit = sc.nextDouble();
                    customer.openSavingsAccount(savingsInitialDeposit);
                    break;
                case 4:
                    System.out.println("Choose type of Fixed Deposit Account:");
                    System.out.println("1. 1-year Fixed Deposit Account");
                    System.out.println("2. 2-year Fixed Deposit Account");
                    System.out.print("Enter your choice: ");
                    int fdChoice = sc.nextInt();
                    double fdAmount;
                    int durationMonths;
                    switch (fdChoice) {
                        case 1:
                            System.out.println("enter the amount to be fixed");
                            fdAmount = sc.nextInt(); 
                            durationMonths = 12; 
                            break;
                        case 2:
                            System.out.println("enter the amount to be fixed");
                            fdAmount = sc.nextInt(); 
                            durationMonths = 24; 
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    customer.openFixedDepositAccount(fdAmount, durationMonths);
                    break;
                case 5:
                    System.out.println("Select Fixed Deposit Account:");
                    for (int i = 0; i < customer.fixedDepositAccounts.size(); i++) {
                        System.out.println((i + 1) + ". Account " + (i + 1));
                    }
                    System.out.print("Enter account number to withdraw from: ");
                    int accountNumber = sc.nextInt();
                    if (accountNumber > 0 && accountNumber <= customer.fixedDepositAccounts.size()) {
                        Customer.FixedDepositAccount fdAccount = customer.fixedDepositAccounts.get(accountNumber - 1);
                        fdAccount.withdrawAfterMaturity();
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 6:
                    System.out.println("Current Balance: $" + customer.getBalance());
                    break;
                case 7:
                    System.out.println("Thank you for using our Banking Management System");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);
        sc.close();
    }
}
