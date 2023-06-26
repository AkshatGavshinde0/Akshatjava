import java.util.HashMap;

public class HashMapExample6 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 8);
        
        int size = map.size();
        System.out.println("Size of the map: " + size);
    }
}

