
import java.util.Scanner;


public class MaxRepChar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String:");
        String str = input.nextLine();
        int[] arr = new int[127];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] += 1;
        }

        int max = -1;
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.println("Character with maximum repetition is: " + c);
    }
}
