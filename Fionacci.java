public class Fionacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int i = 1;
        System.out.println("Fibonacci Series:");
        while (i <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }
    }
}

