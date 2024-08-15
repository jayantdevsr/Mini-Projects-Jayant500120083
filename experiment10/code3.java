import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice to perform: ");
        System.out.println("1. Int to Integer");
        System.out.println("2. Integer to String");
        System.out.println("3. String to Int");
        System.out.println("4. Int to String");
        System.out.println("5. String to Integer");
        System.out.println("6. Integer to Int");
        int n = sc.nextInt();
        sc.nextLine();

        switch (n) {
            case 1:
                // int to Integer
                System.out.println("Enter a int: ");
                int intNumber = sc.nextInt();
                Integer integerValue = Integer.valueOf(intNumber);
                System.out.println("int to Integer: " + integerValue);
                break;

            case 2:
                // Integer to String
                System.out.println("Enter a Integer");
                integerValue = sc.nextInt();
                String integerToString = integerValue.toString();
                System.out.println("Integer to String: " + integerToString);
                break;
            case 3:
                // String to int
                String stringNumber = "123";
                int parsedInt = Integer.parseInt(stringNumber);
                System.out.println("String to int: " + parsedInt);
                break;
            case 4:
                // int to String
                intNumber = 987;
                String intToString = String.valueOf(intNumber);
                System.out.println("int to String: " + intToString);
                break;
            case 5:
                // String to Integer
                String stringInteger = "456";
                Integer parsedInteger = Integer.parseInt(stringInteger);
                System.out.println("String to Integer: " + parsedInteger);
                break;
            case 6:
                // Integer to int
                integerValue = new Integer(789);
                int parsedIntValue = integerValue.intValue();
                System.out.println("Integer to int: " + parsedIntValue);
                break;
            default:
            System.out.println("Invalid choice");

        }
        System.out.println("Jayant Dev SAP: 50120083");
        sc.close();
    }
}
