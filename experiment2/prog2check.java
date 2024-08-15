package experiment2;

import java.util.Scanner;

class prog2check 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the minimum value of the range");
        int min=sc.nextInt();
        System.out.println("enter the maximum value of the range");
        int max=sc.nextInt();
        System.out.println("enter the number to eliminate divisible by numbers");
        int check=sc.nextInt();

        int sum = 0;

        for (int i = min; i < max; i++) 
        {
            if (i % check == 0) 
            {
                sum += i;
            }
        }

        System.out.println("Sum of integers greater than " + min + " and less than " + max + " that are divisible by " + check + ": " + sum);
        System.out.println("Jayant dev\nSAP: 500120083");
    sc.close();
    }
    
}
