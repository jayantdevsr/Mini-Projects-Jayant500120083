package experiment2;

import java.util.Scanner;

class prog1fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Fibonacci series");
        System.out.println("Enter the number upto series will run");
        int n =sc.nextInt();;
        System.out.println("Fibonacci Series up to " + n + " numbers:");

        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
          second = next;
        }
        System.out.println("Jayant dev\nSAP: 500120083");
    sc.close();
    }
    
}
