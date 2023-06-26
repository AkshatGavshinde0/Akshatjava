import java.util.HashMap;

public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 8);
        
        boolean containsKey = map.containsKey("Apple");
        System.out.println("Contains Apple? " + containsKey);
    }
}

