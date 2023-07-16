import java.util.ArrayList;

public class Arrayiterating {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Iterate over the ArrayList using a for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}

