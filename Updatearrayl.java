import java.util.ArrayList;

public class Updatearrayl {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        fruits.set(1, "Orange");
        
        System.out.println("Fruits: " + fruits);
    }
}

