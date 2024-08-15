// File: calculation/Division.java
package calculation;

public class code3Division {
    public static double divide(double a, double b) {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Return NaN (Not a Number) if division by zero occurs
        }
    }
}
