import java.util.HashSet;
import java.util.Set;

public class Hashsetremove {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Removing an element from the set
        String removeElement = "Banana";
        boolean removed = set.remove(removeElement);
        if (removed) {
            System.out.println(removeElement + " removed from the set.");
        } else {
            System.out.println(removeElement + " not found in the set.");
        }
    }
}

