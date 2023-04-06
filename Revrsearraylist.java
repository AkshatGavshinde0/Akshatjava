import java.util.ArrayList;
import java.util.Collections;

public class Reversearraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pineapple");
        
        System.out.println("Before Reversing: " + fruits);
        
        Collections.reverse(fruits);
        
        System.out.println("After Reversing: " + fruits);
    }
}

