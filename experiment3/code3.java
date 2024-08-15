// Import necessary packages if any

class code3 {
    public static void main(String[] args)
    {

        double a = Double.parseDouble(args[0]);
        String symb = args[1];
        double b = Double.parseDouble(args[2]);

        double result = 0;

        switch (symb) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid symb: " + symb);
                
        }

        System.out.println("Result: " + result);
    }
}
