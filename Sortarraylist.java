import java.util.ArrayList;
import java.util.Collections;

public class Sortarraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pineapple");
        
        System.out.println("Before Sorting: " + fruits);
        
        Collections.sort(fruits);
        
        System.out.println("After Sorting: " + fruits);
    }
}

