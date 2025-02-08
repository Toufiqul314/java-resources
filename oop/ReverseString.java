
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev +=str.charAt(i);
        }
        System.out.println("Reverse String is " + rev);
        // if we chacked the palindrome or not palindrome
        if (str.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
