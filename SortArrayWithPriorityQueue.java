import java.util.Arrays;
import java.util.PriorityQueue;

public class SortArrayWithPriorityQueue {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 2, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pq.poll();
        }
    }
}

