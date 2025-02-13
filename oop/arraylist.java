
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class arraylist {

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(5);
        // list.add(2);
        // list.add(3);
        // System.out.println(list.get(1));
        // list.remove(0);
        // System.out.println(list);
        // list.set(1, 7);
        // System.out.println(list);

        // List<String> list = new ArrayList<String>();
        // list.add("b");
        // list.add("a");
        // list.add("c");
        // Collections.sort(list);
        // System.out.println(list.get(0));
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        it.next();
        System.out.println(it.next());
    }
}
