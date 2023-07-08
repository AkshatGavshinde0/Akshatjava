public class Logical {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical operators: && (AND), || (OR), ! (NOT)

        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + !x); // Logical NOT

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Logical operators with relational operators

        System.out.println("(num1 < num2) && (num2 < num3): " + ((num1 < num2) && (num2 < num3))); // true && true = true
        System.out.println("(num1 < num2) || (num2 > num3): " + ((num1 < num2) || (num2 > num3))); // true || false = true
}
}


