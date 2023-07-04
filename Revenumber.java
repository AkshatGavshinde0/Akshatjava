public class Revenumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);
        System.out.println("Reversed number: " + reversedNumber);
    }
}

