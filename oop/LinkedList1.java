
import java.util.*;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.get(2); //O(n)
        linkedList.addLast(7); //O(1)
        linkedList.addFirst(0); //O(1)
    }
}
