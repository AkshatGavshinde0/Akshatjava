public class LinearSearchExists {
    public static boolean numberExists(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true; // Return true if the target is found
            }
        }
        return false; // Return false if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 9, 3, 7, 2, 8, 1, 6 };

        int target = 4;
        boolean exists = numberExists(numbers, target);

        if (exists) {
            System.out.println("Number " + target + " exists in the array.");
        } else {
            System.out.println("Number " + target + " does not exist in the array.");
        }
    }
}

