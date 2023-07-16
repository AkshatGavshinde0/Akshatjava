import java.util.ArrayList;

public class Arrayremove {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Remove an element by index
        colors.remove(2);

        // Remove an element by value
        colors.remove("Green");

        // Print the updated ArrayList
        System.out.println(colors);
    }
}

