import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeysExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Get the set of keys from the map
        Set<String> keys = map.keySet();

        System.out.println("Keys in the map: " + keys);
    }
}

