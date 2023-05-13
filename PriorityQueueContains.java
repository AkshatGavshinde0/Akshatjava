import java.util.PriorityQueue;

public class PriorityQueueContains {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        
        System.out.println("Contains 2? " + pq.contains(2));
        System.out.println("Contains 7? " + pq.contains(7));
    }
}

