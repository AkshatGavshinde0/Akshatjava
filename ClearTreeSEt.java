import java.util.TreeSet;

public class ClearTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(1);

        // Clear the TreeSet
        treeSet.clear();

        // Check if the TreeSet is empty
        System.out.println("TreeSet is empty: " + treeSet.isEmpty());
    }
}

