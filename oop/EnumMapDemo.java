
import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {
        // array of size same as enum
        // no hashing 
        // ordinal / index is used
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.SUNDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        // System.out.println(Day.TUESDAY.ordinal());
        System.out.println(map);
    }
}

enum Day {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}
