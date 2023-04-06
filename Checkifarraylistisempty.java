import java.util.ArrayList;

public class Checkifarraylistisempty {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        System.out.println("Is ArrayList Empty: " + fruits.isEmpty());
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        System.out.println("Is ArrayList Empty: " + fruits.isEmpty());
    }
}

