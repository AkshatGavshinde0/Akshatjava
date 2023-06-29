public class Binarysearch {
    public static int binarysearch(int[] array, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (array[mid] == target)
            return mid;
        else if (array[mid] > target)
            return binarySearch(array, start, mid - 1, target);
        else
            return binarySearch(array, mid + 1, end, target);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;
        int result = binarySearch(array, 0, array.length - 1, target);
        System.out.println("Element " + target + " found at index " + result);
    }
}

