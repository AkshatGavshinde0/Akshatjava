public class SumOfNumbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("The sum of the first 100 natural numbers is " + sum);
    }
}

