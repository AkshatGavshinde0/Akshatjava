import java.util.HashSet;

public class HashSetExample3 {
    public static void main(String[] args) {
        // Create the first HashSet
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second HashSet
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Perform the intersection of the two HashSets
        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        // Display the intersection set
        System.out.println("Intersection Set: " + intersectionSet);
    }
}

