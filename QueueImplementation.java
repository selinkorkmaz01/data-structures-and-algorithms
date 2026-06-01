import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        System.out.println("Queue: " + queue);

        System.out.println("First Element: " + queue.peek());

        queue.remove();

        System.out.println("After Remove: " + queue);
    }
}
