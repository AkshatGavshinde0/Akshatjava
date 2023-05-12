import java.util.ArrayDeque;

public class StackExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Push elements
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);

        // Pop elements
        while (!stack.isEmpty()) {
            int element = stack.removeFirst();
            System.out.println("Popped: " + element);
        }
    }
}

