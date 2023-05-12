import java.util.ArrayDeque;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1, 5};

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int value : array) {
            if (!deque.contains(value)) {
                deque.addLast(value);
            }
        }

        int[] result = new int[deque.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = deque.removeFirst();
        }

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}

