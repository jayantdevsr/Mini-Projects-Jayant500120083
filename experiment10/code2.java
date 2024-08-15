import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice you want to perform: ");
        System.out.println("1. HashCode");
        System.out.println("2. Trim");
        System.out.println("3. Intern");
        System.out.println("4. Calculate length");
        System.out.println("5. Replace");
        System.out.println("6. Substring");
        int n = sc.nextInt();
        sc.nextLine();

        switch (n) {

            case 1:
                // int hashCode()
                System.out.println("Enter the string: ");
                String str1 = sc.nextLine();
                int hashCode = str1.hashCode();
                System.out.println("HashCode of str1: " + hashCode);
                break;

            case 2:
                // String trim()
                System.out.println("Enter the string with spaces");
                String str2 = sc.nextLine();
                String trimmedStr = str2.trim();
                System.out.println("Trimmed string of str2: \"" + trimmedStr + "\"");
                break;
            case 3:
                // String intern()
                System.out.println("Enter the string: ");
                String str3 = sc.nextLine();
                String internedStr = str3.intern();
                System.out.println("Interned string of str3: " + ("hello" == internedStr));
                break;
            case 4:
                // int length()
                System.out.println("Enter the String");
                String str4 = sc.nextLine();
                int length = str4.length();
                System.out.println("Length of str4: " + length);
                break;
            case 5:
                // String replace(char oldChar, char newChar)
                System.out.println("Enter the String: ");
                String str5 = sc.nextLine();
                String replacedStr = str5.replace('o', '0');
                System.out.println("String after replacement: " + replacedStr);
                break;
            case 6:
                // String substring(int beginIndex, int endIndex)
                
                String str6 = new String("Hello");
                String subStr = str6.substring(6, 11);
                System.out.println("Substring of str6: " + subStr);
                break;
            default:
                System.out.println("Enter the valid choice");
        }

        System.out.println("Jayant Dev SAP: 500120083");
        sc.close();
    }
}
