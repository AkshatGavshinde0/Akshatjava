public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int key = 6;
        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index " + result);
    }
}

