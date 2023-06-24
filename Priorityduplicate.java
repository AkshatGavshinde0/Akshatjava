import java.util.PriorityQueue;

public class Priorityduplicate {
    public static void main(String[] args) {
        // Initialize a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add duplicate elements to the priority queue
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(2);

        // Print the elements in sorted order
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

