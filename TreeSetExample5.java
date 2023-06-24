import java.util.TreeSet;

public class TreeSetExample5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");

        System.out.println("TreeSet elements:");

        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}

