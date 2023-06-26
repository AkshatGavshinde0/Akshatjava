import java.util.HashMap;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 8);
        
        int value = map.get("Banana");
        System.out.println("Number of bananas: " + value);
    }
}

