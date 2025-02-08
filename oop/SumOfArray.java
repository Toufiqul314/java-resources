
import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = inputs.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = inputs.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the array: " + sum);
    }
}
