public class Maximumnumber {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};
        int max = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
        System.out.println("Maximum number: " + max);
    }
}

