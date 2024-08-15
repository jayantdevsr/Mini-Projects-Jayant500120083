// File: Test.java
import calculation.code3Addition;
import calculation.code3Subtraction;
import calculation.code3Division;
import calculation.code3Multiplication;

public class code3Test {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition: " + code3Addition.add(a, b));
        System.out.println("Subtraction: " + code3Subtraction.subtract(a, b));
        System.out.println("Division: " + code3Division.divide(a, b));
        System.out.println("Multiplication: " + code3Multiplication.multiply(a, b));
    }
}
