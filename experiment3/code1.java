// package experiment3;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello welcome the month calculator program in java");
        System.out.println("Please enter the number between 1-12");
        int nummonth=sc.nextInt();

        switch (nummonth) {
            case 1:
            System.out.println("the month is January");
            break;
            case 2:
            System.out.println("the month is Febraury");
            break;
            case 3:
            System.out.println("the month is march");
            break;
            case 4:
            System.out.println("the month is april");
            break;
            case 5:
            System.out.println("the month is may");
            break;
            case 6:
            System.out.println("the month is june");
            break;
            case 7:
            System.out.println("the month is july");
            break;
            case 8:
            System.out.println("the month is august");
            break;
            case 9:
            System.out.println("the month is september");
            break;
            case 10:
            System.out.println("the month is october");
            break;
            case 11:
            System.out.println("the month is novemeber");
            break;
            case 12:
            System.out.println("the month is december");
            break;

        
            default:
            System.out.println("you have entered a wrong number Retry");
                break;
        }
        System.out.println("Jayant dev\nSAP: 500120083");
    sc.close();
    }
    
}
