import java.util.HashSet;

public class HashSetExample2 {
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

        // Perform the union of the two HashSets
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Display the union set
        System.out.println("Union Set: " + unionSet);
    }
}

