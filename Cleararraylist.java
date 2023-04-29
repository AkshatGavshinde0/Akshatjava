import java.util.ArrayList;

public class Cleararraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        System.out.println("Before Clearing: " + fruits);
        
        fruits.clear();
        
        System.out.println("After Clearing: " + fruits);
    }
}

