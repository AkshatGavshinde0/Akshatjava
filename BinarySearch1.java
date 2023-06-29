import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch1 {
    public static int binarySearch(List<Integer> list, int key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) == key)
                return mid;

            if (list.get(mid) < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        int key = 6;
        int result = binarySearch(list, key);

        if (result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index " + result);
    }
}

