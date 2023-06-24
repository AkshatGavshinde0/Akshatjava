import java.util.Deque;
import java.util.LinkedList;

public class Dequepeek {
    public static void main(String[] args) {
        // Initialize a Deque
        Deque<Integer> deque = new LinkedList<>();

        // Insert elements
        deque.addLast(5);
        deque.addLast(2);
        deque.addLast(8);

        // Peek operations
        int first = deque.peekFirst();
        int last = deque.peekLast();

        // Print the peeked elements
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}

