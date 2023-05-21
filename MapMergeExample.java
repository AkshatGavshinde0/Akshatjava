import java.util.HashMap;
import java.util.Map;

public class MapMergeExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("John", 25);
        map1.put("Alice", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Bob", 35);
        map2.put("Charlie", 40);

        // Merge map2 into map1
        map1.putAll(map2);

        System.out.println("Merged map: " + map1);
    }
}

