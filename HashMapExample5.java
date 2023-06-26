import java.util.HashMap;

public class HashMapExample5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 8);
        
        boolean containsValue = map.containsValue(5);
        System.out.println("Contains value 5? " + containsValue);
    }
}

