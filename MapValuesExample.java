import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class MapValuesExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Get the collection of values from the map
        Collection<Integer> values = map.values();

        System.out.println("Values in the map: " + values);
    }
}

