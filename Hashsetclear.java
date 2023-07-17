import java.util.HashSet;
import java.util.Set;

public class Hashsetclear {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Clearing all elements from the set
        set.clear();
        System.out.println("Set size after clearing: " + set.size());
    }
}

