import java.util.TreeSet;

public class ElementExistsTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(1);

        // Check if an element exists in the TreeSet
        boolean exists = treeSet.contains(9);
        System.out.println("Element 9 exists: " + exists);
    }
}

