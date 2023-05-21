import java.util.HashMap;
import java.util.Map;

public class MapValueCheckExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        int value = 30;

        // Check if value exists in the map
        if (map.containsValue(value)) {
            System.out.println(value + " exists in the map.");
        } else {
            System.out.println(value + " does not exist in the map.");
        }
    }
}

