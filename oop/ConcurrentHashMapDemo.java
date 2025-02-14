
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer>map=new ConcurrentHashMap<>();

        // java -7 --> segment based locking ---> 16 segments --> smaller hashmaps
        // only the segment being written to or read from is locked
        // read : do not require locking unless there a write operation happening on the same segment 
        // worite :lock

        //java -8 --> no segmentation
        // --> copare-And-Swap approach --> no locking except resiing or collision
        // Thread a last saw --> x =45
        // Thread A work --> x to 50
        // if x is still 45 ,then cange it to 50 else don't change and retry
        // put --> index

        // Map --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap
    }
}
