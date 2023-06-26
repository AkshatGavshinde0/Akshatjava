import java.util.HashMap;

public class HashMapExample4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 8);
        
        map.remove("Banana");
        System.out.println(map);
    }
}

