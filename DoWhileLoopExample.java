public class DoWhileLoopExample {
    public static void main(String[] args) {
        int number = 1;
        
        do {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 20);
    }
}

