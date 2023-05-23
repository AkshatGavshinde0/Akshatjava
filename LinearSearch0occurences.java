public class LinearSearchOccurrences {
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 9, 3, 7, 2, 8, 1, 6, 5, 9, 5 };

        int target = 5;
        int occurrences = countOccurrences(numbers, target);

        System.out.println("Number " + target + " occurs " + occurrences + " times in the array.");
    }
}

