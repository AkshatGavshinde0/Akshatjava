import java.util.Deque;
import java.util.LinkedList;

public class Dequesize{
    public static void main(String[] args) {
        // Initialize a Deque
        Deque<Integer> deque = new LinkedList<>();

        // Insert elements
        deque.addLast(5);
        deque.addLast(2);
        deque.addLast(8);

        // Check size and empty
        int size = deque.size();
        boolean isEmpty = deque.isEmpty();

        // Print the size and empty status
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
    }
}

