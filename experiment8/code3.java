class NonNumericOperandException extends Exception {
    public NonNumericOperandException(String message) {
        super(message);
    }
}

public class code3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Code is working target successful");
            System.out.println("JAYANT DEV SAP: 500120083");
            return;
        }

        String operand1 = args[0];
        String operand2 = args[1];

        try {
            double result = calculateModule(operand1, operand2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-numeric operand provided.");
        } catch (NonNumericOperandException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double calculateModule(String operand1, String operand2) throws NonNumericOperandException {
        try {
            double num1 = Double.parseDouble(operand1);
            double num2 = Double.parseDouble(operand2);
            if (Double.isNaN(num1) || Double.isNaN(num2))
                throw new NonNumericOperandException("One of the operands is not numeric.");
            return num1 % num2;
        } catch (NumberFormatException e) {
            throw new NonNumericOperandException("One of the operands is not numeric.");
        }
    }
}
