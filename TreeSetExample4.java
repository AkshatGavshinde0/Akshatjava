import java.util.TreeSet;

public class TreeSetExample4 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);

        int size = treeSet.size();

        System.out.println("Size of the TreeSet: " + size);
    }
}

