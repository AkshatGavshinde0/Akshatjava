import java.util.TreeSet;

public class RemoveFromTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(1);

        // Remove elements from the TreeSet
        treeSet.remove(3);

        // Print the elements of the TreeSet
        for (int element : treeSet) {
            System.out.println(element);
        }
    }
}

