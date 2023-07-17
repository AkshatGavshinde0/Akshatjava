import java.util.HashSet;
import java.util.Set;

public class Hashsetspecific {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Checking if a specific element is present in the set
        String searchElement = "Banana";
        boolean containsElement = set.contains(searchElement);
        System.out.println("Set contains " + searchElement + ": " + containsElement);
    }
}

