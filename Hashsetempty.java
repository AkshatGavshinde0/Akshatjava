import java.util.HashSet;
import java.util.Set;

public class Hashsetempty {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Checking if the set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is set empty? " + isEmpty);
    }
}

