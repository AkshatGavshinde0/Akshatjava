import java.util.ArrayList;

public class Removearl {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        fruits.remove(1);
        
        System.out.println("Fruits: " + fruits);
    }
}

