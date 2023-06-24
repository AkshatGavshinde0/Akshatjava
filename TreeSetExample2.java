import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);

        System.out.println("Before removal: " + treeSet);

        treeSet.remove(20);

        System.out.println("After removal: " + treeSet);
    }
}

