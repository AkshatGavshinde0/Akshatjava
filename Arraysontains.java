public class Arraysontains {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Array contains " + target);
        } else {
            System.out.println("Array does not contain " + target);
        }
    }
}

