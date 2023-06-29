public class LinearSearchMaxElement {
    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 9, 3, 7, 2, 8, 1, 6 };

        int maxElement = findMaxElement(numbers);

        System.out.println("The maximum element in the array is: " + maxElement);
    }
}

