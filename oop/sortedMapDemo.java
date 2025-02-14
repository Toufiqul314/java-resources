
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMapDemo {

    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("tusher", 90);
        sortedMap.put("toufiqul", 80);
        sortedMap.put("arman", 70);

        System.out.println(sortedMap);

        SortedMap<Integer, String> map = new TreeMap<>((a,b)->b-a);
        map.put(90, "tusher");
        map.put(80, "toufiqul");
        map.put(85,"kawser");
        map.put(75, "hasan");
        map.put(70, "arman");

        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(80)); // exclude
        System.out.println(map.tailMap(90));

        // NavigableMap
        NavigableMap<Integer,String>navigableMap=new TreeMap<>();
        navigableMap.put(1,"one");
        navigableMap.put(3,"trree");
        navigableMap.put(5,"five");
        navigableMap.put(2,"two");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(3));
        System.out.println(navigableMap.ceilingKey(4));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());
    }
}
