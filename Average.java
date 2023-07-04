public class Average {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}

