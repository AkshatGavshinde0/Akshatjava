import java.util.HashMap;
import java.util.Map;

public class MapClearExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Clear the map
        map.clear();

        System.out.println("Map is cleared. Size: " + map.size());
    }
}

