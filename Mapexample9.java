 
import java.util.Map;

public class Mapexample9 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Alex", 28);

        // Getting all keys
        System.out.println("Keys: " + map.keySet());

        // Getting all values
        System.out.println("Values: " + map.values());
    }
}

