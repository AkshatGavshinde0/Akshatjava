import java.util.TreeSet;

public class FirstLastTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(1);

        // Get the first element of the TreeSet
        int firstElement = treeSet.first();
        System.out.println("First element: " + firstElement);

        // Get the last element of the TreeSet
        int lastElement = treeSet.last();
        System.out.println("Last element: " + lastElement);
    }
}

