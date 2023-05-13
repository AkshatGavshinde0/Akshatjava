import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueWithComparator {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Cherry");
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

