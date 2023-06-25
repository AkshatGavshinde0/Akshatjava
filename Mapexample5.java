
import java.util.Map;

public class Mapexample5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Alex", 28);

        boolean exists = map.containsValue(30);
        System.out.println("Value '30' exists: " + exists);
    }
}

