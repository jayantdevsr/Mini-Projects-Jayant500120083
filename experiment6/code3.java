import java.util.Scanner;

interface MyInterface {
    void divisions(int a, int b); 
    void modules(int a, int b);   
}

class MyCalculator implements MyInterface {
    @Override
    public void divisions(int a, int b) {
        if (b != 0) {
            System.out.println("Division of " + a + " by " + b + " is: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    @Override
    public void modules(int a, int b) {
        if (b != 0) {
            System.out.println("Modulus of " + a + " by " + b + " is: " + (a % b));
        } else {
            System.out.println("Cannot perform modulus with zero divisor.");
        }
    }
}

public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        MyCalculator calculator = new MyCalculator();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        calculator.divisions(num1, num2);
        calculator.modules(num1, num2);

        sc.close();
    }
}
