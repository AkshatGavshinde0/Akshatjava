import java.util.TreeSet;

public class CeilingFloorTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(1);

        // Find the ceiling of an element in the TreeSet
        int ceiling = treeSet.ceiling(4);
        System.out.println("Ceiling of 4: " + ceiling);

        // Find the floor of an element in the TreeSet
        int floor = treeSet.floor(8);
        System.out.println("Floor of 8: " + floor);
    }
}

