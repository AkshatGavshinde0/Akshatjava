public class Arraymin {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 3, 9, 2};
        int min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Minimum value: " + min);
    }
}

