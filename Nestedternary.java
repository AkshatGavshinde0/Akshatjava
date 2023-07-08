public class Nestedternary {
    public static void main(String[] args) {
        int num = 10;

        String result = (num > 0) ? ((num % 2 == 0) ? "Positive Even" : "Positive Odd") : "Negative";
        System.out.println("Number is: " + result);
    }
}

