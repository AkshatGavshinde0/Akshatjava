import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);

        // Printing the deque
        System.out.println("Deque: " + deque);

        // Accessing the first and last elements
        int first = deque.getFirst();
        int last = deque.getLast();
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);

        // Removing elements from the deque
        int removedElement = deque.removeFirst();
        System.out.println("Removed Element: " + removedElement);

        // Printing the deque after removal
        System.out.println("Deque: " + deque);
    }
}

