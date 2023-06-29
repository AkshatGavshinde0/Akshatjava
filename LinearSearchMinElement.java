public class LinearSearchMinElement {
    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 9, 3, 7, 2, 8, 1, 6 };

        int minElement = findMinElement(numbers);

        System.out.println("The minimum element in the array is: " + minElement);
    }
}

