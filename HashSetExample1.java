import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        // Check if an element exists in the HashSet
        String searchElement = "Banana";
        if (set.contains(searchElement)) {
            System.out.println(searchElement + " exists in the HashSet");
        } else {
            System.out.println(searchElement + " does not exist in the HashSet");
        }
    }
}

