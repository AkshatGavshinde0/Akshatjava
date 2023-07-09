public class Arraymax {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}

