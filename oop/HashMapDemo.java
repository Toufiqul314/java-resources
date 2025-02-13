
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Toufiqul");
        hashMap.put(102, "Tusher");
        hashMap.put(103, "Arman");

        System.out.println(hashMap);

        String name = hashMap.get(102);
        System.out.println("Name for key 102: " + name);

        System.out.println(hashMap.containsKey(102));

        // loop 
        //Set<Integer>keys=hashMap.keySet();
        for (int i : hashMap.keySet()) {
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            //System.out.println(entry.getKey()+" "+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());

        }
        System.out.println(hashMap);

    }
}
