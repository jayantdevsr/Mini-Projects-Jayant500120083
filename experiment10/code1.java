import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice you want to perform: ");
        System.out.println("1. Concatenation");
        System.out.println("2. Equals");
        System.out.println("3. Equal Ignorecase");
        System.out.println("4. To convert into upper case");
        System.out.println("5. Know the index value ");
        System.out.println("6. Comparison of strings");
        int n = sc.nextInt();
        sc.nextLine(); 
        switch (n) {
            case 1:
                // String concat(String str)
                System.out.println("enter the first string");
                String str1 = sc.nextLine();
                System.out.println("enter the second string");
                String str2 = sc.nextLine();
                String concatenated = str1.concat(" ").concat(str2);
                System.out.println("Concatenated string: " + concatenated);
                break;
            case 2:
                // boolean equals(Object anObject)
                System.out.println("enter the first string");
                String str3 = sc.nextLine();
                System.out.println("enter the second string");
                String str4 = sc.nextLine();
                boolean isEqual = str3.equals(str4);
                System.out.println("Are str3 and str4 equal? " + isEqual);
                break;
            case 3:
                // boolean equalsIgnoreCase(String anotherString)
                System.out.println("enter the first string");
                String str5 = sc.nextLine();
                System.out.println("enter the second string");
                String str6 = sc.nextLine();
                boolean isEqualIgnoreCase = str5.equalsIgnoreCase(str6);
                System.out.println("Are str5 and str6 equal ignoring case? " + isEqualIgnoreCase);
                break;
            case 4:
                // String toUpperCase()
                System.out.println("enter the string");
                String str7 = sc.nextLine();
                String upperCaseStr = str7.toUpperCase();
                System.out.println("Uppercase of " + upperCaseStr);
                break;
            case 5:
                // char charAt(int index)
                System.out.println("enter the string");
                String str8 = sc.nextLine();
                char charAtIndex = str8.charAt(2);
                System.out.println("Character at index 2 in " + charAtIndex);
                break;
            case 6:
                // int compareTo(String anotherString)
                System.out.println("enter the first string");
                String str9 = sc.nextLine();
                System.out.println("enter the second string");
                String str10 = sc.nextLine();
                int comparisonResult = str9.compareTo(str10);
                System.out.println("Comparison result of " + comparisonResult);
                break;
            default:
            System.out.println("enter the valid choice");
        }
        System.out.println("Jayant Dev SAP: 500120083");
        sc.close();
    }
}
