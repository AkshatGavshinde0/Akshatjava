public class CountDigits {
    public static int countDigits(int n) {
        if (n < 10)
            return 1;
        else
            return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = countDigits(number);
        System.out.println("Number of digits in " + number + " is " + result);
    }
}

