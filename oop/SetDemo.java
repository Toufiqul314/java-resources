
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        // set is a collection that connnot contain duplicates elements
        // set does not maintain the order of elements
        // set does not support indexing or accessing elements
        //faster operations
        // Map -> HashMap,LinkedHashMap,TreeMap,EnumMap
        // Set -> HashSet, LinkedHashSet, TreeSet,EnumSet
        // unordered HashSet
        // ordered LinkedHashSet
        // TreeSet -> sorted order
        // EnumSet -> contains only constants (enum values)
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(2);
        set.add(2);
        set.add(64);
        set.add(50);
        set.add(60);

        System.out.println(set);
    }
}
