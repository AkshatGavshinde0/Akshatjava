import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

        boolean containsGreen = treeSet.contains("Green");

        System.out.println("TreeSet contains 'Green': " + containsGreen);
    }
}

