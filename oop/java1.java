

public class java1 {

    public static void main(String[] args) {
        int t = 1;
        int ts = 3;
        ts += 1 + t++;
        t *= 2;
        ts += (long) 1;
        System.out.println(t);
        System.out.println(ts);
    }
}
