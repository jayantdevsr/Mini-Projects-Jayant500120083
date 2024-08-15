package experiment2;
import java.util.Scanner;

class prog3simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest (in percentage): ");
        double rateOfInterest = sc.nextDouble();
        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rateOfInterest * time) / 100;

        System.out.println("Principal amount: " + principal);
        System.out.println("Rate of interest: " + rateOfInterest + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);

        System.out.println("Jayant dev\nSAP: 500120083");

        sc.close();
    }
}
