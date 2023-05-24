public class BinarySearch3 {
    public static int binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int compareResult = arr[mid].compareTo(key);

            if (compareResult == 0)
                return mid;

            if (compareResult < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "cherry", "grape", "orange" };
        String key = "cherry";
        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index " + result);
    }
}

