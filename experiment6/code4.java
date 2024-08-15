import java.util.Scanner;

interface Test {
    int square(int num); 
}

class Arithmetic implements Test {
    @Override
    public int square(int num) {
        return num * num; 
    }
}

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arithmetic obj = new Arithmetic();

        System.out.print("Enter a number to calculate its square: ");
        int num = sc.nextInt();

        int result = obj.square(num);

        System.out.println("Square of " + num + " is: " + result);

        sc.close();
    }
}
