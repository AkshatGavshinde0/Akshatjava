
import java.util.Map;

public class Mapexample3{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Alex", 28);

        map.remove("Jane");
        System.out.println(map);
    }
}
