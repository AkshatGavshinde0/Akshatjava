import java.util.HashMap;
import java.util.Map;

public class MapKeyCheckExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        String key = "Alice";

        // Check if key exists in the map
        if (map.containsKey(key)) {
            System.out.println(key + " exists in the map.");
        } else {
            System.out.println(key + " does not exist in the map.");
        }
    }
}

