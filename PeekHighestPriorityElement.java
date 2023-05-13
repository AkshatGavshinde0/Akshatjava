import java.util.PriorityQueue;

public class PeekHighestPriorityElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        
        System.out.println("Highest priority element: " + pq.peek());
    }
}

