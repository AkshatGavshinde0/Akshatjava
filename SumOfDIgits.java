public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is " + result);
    }
}

