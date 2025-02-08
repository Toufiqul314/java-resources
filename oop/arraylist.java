
import java.util.ArrayList;

class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list);
        list.set(1, 7);
        System.out.println(list);
    }
}
