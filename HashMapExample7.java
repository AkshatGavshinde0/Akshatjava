import java.util.HashMap;
import java.util.Map;

public class HashMapExample7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 8);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}

