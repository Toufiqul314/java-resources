
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        //immutable map 10 entries
        // Map<String, Integer> map3 = Map.of("tusher", 98, "toufiqul", 99, "arman", 100);
        // map3.put("islam", 88);

        Map<String,Integer>map4=Map.ofEntries(Map.entry("islma", 99),Map.entry("toufiqul", 98));
    }
}
