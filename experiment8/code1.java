

public class code1 {
    public static void main(String[] args) {
        String[] studentNames = { "Jayant", "jayesh", "harsh", "riya", "renuka" };
        int[] rollNumbers = { 101, 102, 103, 104, 105 };
        try {
            System.out.println("Student Details:");
            for (int i = 0; i <= 7; i++) {
                System.out.println("Name: " + studentNames[i] + ", Roll Number: " + rollNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
            System.out.println("Program exit");
            System.out.println("Jayant Dev SAP: 500120083");
        }
    }
}