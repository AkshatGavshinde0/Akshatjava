import java.util.ArrayList;

public class CheckElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        boolean containsApple = fruits.contains("Apple");
        boolean containsPineapple = fruits.contains("Pineapple");
        
        System.out.println("Contains Apple: " + containsApple);
        System.out.println("Contains Pineapple: " + containsPineapple);
    }
}

