import java.util.HashMap;
import java.util.Map;

public class MapEntryRemovalExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        String key = "Alice";

        // Remove the entry with the specified key
        map.remove(key);

        System.out.println(key + " is removed from the map.");
    }
}

