
import java.util.*;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}

class Student {

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

}

public class comparator {

    public static void main(String[] args) {
        /* //comparator
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        //list.sort(new MyComparator());
        list.sort((a, b) -> b - a);// lambda expression
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        //words.sort(new StringLengthComparator());
        words.sort((a, b) -> a.length() - b.length()); // lambda exprasion 
        System.out.println(words);  //prints: [banana, apple, date]
        //end comparator
         */

        List<Student> students = new ArrayList<>();
        students.add(new Student("Toufiqul", 3.9));
        students.add(new Student("Tusher", 3.8));
        students.add(new Student("Jubayer", 3.7));
        students.add(new Student("Sakib", 3.6));
        students.add(new Student("Habib", 3.9));
        students.add(new Student("islma", 3.6));

        // students.sort((o1, o2) -> {
        //     if (o2.getGpa() - o1.getGpa() > 0) {
        //         return 1;
        //     } else if (o2.getGpa() - o1.getGpa() < 0) {
        //         return -1;
        //     } else {
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // });

        //assending sort and descending order and same gpa with name sort order
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getGpa());
        }

    }
}
