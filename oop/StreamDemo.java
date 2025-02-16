
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        // feature introduced in Java 8
        // process collections of data in a functional and declarative manner
        // simplify Data Processing 
        // Embrace Functional Programming
        // Inprove Readability and Maintainability
        // Enable Easy Parallelism

        //What is Stream?
        // a sequence of elements supporting functional and declarative programming
        // How to use Streams?
        // Source,intermediate operations & termian operation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);

        // stream
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        // creating Streams
        // 1.From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        // 2.From Arrays
        String[] array = { "a", "b", "c" };
        Stream<String> stream1 = Arrays.stream(array);

        // 3.Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");

        // 4. Infinite Stream
        Stream<Integer> generate = Stream.generate(()->1);
    }
}
