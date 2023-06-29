import java.util.Scanner;

public class LinearSearchExample {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 9, 3, 7, 2, 8, 1, 6 };

        System.out.println("Enter the number to search:");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Number " + target + " found at index " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}

