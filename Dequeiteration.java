import java.util.Deque;
import java.util.LinkedList;

public class Dequeiteration {
    public static void main(String[] args) {
        // Initialize a Deque
        Deque<Integer> deque = new LinkedList<>();

        // Insert elements
        deque.addLast(5);
        deque.addLast(2);
        deque.addLast(8);

        // Iterate over the elements
        for (int num : deque) {
            System.out.println(num);
        }
    }
}

