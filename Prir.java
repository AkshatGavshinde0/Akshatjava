public class Prir {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;
        int i = 2;
        do {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        } while (i < number);
        System.out.println(number + " is" + (isPrime ? " " : " not ") + "a prime number.");
    }
}

