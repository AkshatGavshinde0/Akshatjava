import java.util.PriorityQueue;
import java.util.Comparator;

public class Prioritycomparator {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

