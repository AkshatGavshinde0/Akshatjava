public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int n = 10; // the number of terms to print
        System.out.print(a + " " + b + " ");
        do {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            n--;
        } while (n > 2);
    }
}

