
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.add(1); // enqueue
        list.add(2); // enqueue
        list.add(3); // enqueue

        System.out.println(list);
        Integer i = list.remove(); //dequeue
        System.out.println(list);
        list.peek();// peek

        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.size());
        queue.add(1);
        System.out.println(queue.remove()); // queue is empty throws exception if empty
        System.out.println(queue.poll()); //better

        //System.out.println(queue.element()); //queue is empty throws exception if empty
        System.out.println(queue.peek());

        //fixed size queue
        Queue<Integer>queue1=new ArrayBlockingQueue<>(2);
        queue1.add(1);
        queue1.offer(2);

        //queue1.add(3);
        queue1.offer(3);
    }
}
