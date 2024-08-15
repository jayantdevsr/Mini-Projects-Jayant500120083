package experiment2;
import java.util.Scanner;
class prog4pyramid
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the height of the pyramid: ");
        int n=sc.nextInt();
        
        for(int i=1; i<=n;i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
                
            }
        System.out.println();
        }
        System.out.println("JAYANT DEV\nSAP: 500120083");
        sc.close();
    }
}