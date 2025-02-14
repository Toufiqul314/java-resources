
import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {

    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Hashtable is synchronized
        // no null key or value
        // legacy class, concurrentHashMap
        // slower than hashMap
        //only linked list in case of collision
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        System.out.println(hashtable);
        System.out.println("value of key 2 is " + hashtable.get(2));
        System.out.println("Does key 3 exist ? " + hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("After removing key 1 :" + hashtable);
        // hashtable.put(null, "vlue"); //throws exception
        //hashtable.put(4, null); //throws exception

        HashMap<Integer, String> map = new HashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("final map Size of  " + map.size());
    }
}
