import java.util.ArrayDeque;

public class ArrayDeque3{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = array.length - 1; i >= 0; i--) {
            deque.addLast(array[i]);
        }

        System.out.println("Original Array: " + java.util.Arrays.toString(array));

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = deque.removeFirst();
        }

        System.out.println("Reversed Array: " + java.util.Arrays.toString(reversedArray));
    }
}

