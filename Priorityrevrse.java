import java.util.PriorityQueue;
import java.util.Collections;

public class Priorityreverse {
    public static void main(String[] args) {
        // Initialize a priority queue with reverse order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the priority queue
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        // Print the elements in reverse order
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

