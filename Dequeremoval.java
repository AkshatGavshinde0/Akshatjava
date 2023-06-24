import java.util.Deque;
import java.util.LinkedList;

public class Dequeremoval {
    public static void main(String[] args) {
        // Initialize a Deque
        Deque<Integer> deque = new LinkedList<>();

        // Insert elements
        deque.addLast(5);
        deque.addLast(2);
        deque.addLast(8);

        // Remove elements
        int first = deque.removeFirst();
        int last = deque.removeLast();

        // Print the removed elements
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}

