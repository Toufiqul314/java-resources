
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        // copyonwriteArrayList
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Egg");
        shoppingList.add("Bread");
        System.out.println(shoppingList + "initial shopping list : ");
        for (String item : shoppingList) {
            System.out.println(item);
            // try to modify the list while reading
            if (item.equals("Egg")) {
                shoppingList.add("butter");
                System.out.println("added butter while reading.");
            }
        }
        System.out.println("updated shopping list : " + shoppingList);

    }
}
