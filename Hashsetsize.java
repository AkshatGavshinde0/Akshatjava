import java.util.HashSet;
import java.util.Set;

public class Hashaetsize {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(1);
        set.add(2);
        set.add(3);

        // Finding the size of the set
        int size = set.size();
        System.out.println("Set size: " + size);
    }
}

