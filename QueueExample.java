import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Enqueue elements
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        // Dequeue elements
        while (!queue.isEmpty()) {
            int element = queue.removeFirst();
            System.out.println("Dequeued: " + element);
        }
    }
}

