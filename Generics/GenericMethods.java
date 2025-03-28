package Generics;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "Hello", "World" };
        printArray(intArray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
