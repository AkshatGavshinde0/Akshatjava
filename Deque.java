import java.util.Deque;
import java.util.LinkedList;

public class Deque {
    public static void main(String[] args) {
        // Initialize a Deque
        Deque<Integer> deque = new LinkedList<>();

        // Insert elements at the end
        deque.addLast(5);
        deque.addLast(2);
        deque.addLast(8);

        // Insert elements at the front
        deque.addFirst(1);
        deque.addFirst(3);

        // Print the elements
        System.out.println(deque);
    }
}

