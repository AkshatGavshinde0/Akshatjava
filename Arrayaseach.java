public class Arraysearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }
        
        System.out.println("Target found: " + found);
    }
}

