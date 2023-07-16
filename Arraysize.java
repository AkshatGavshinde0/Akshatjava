import java.util.ArrayList;

public class Arraysize{
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Get the size of the ArrayList
        int size = numbers.size();

        // Print the size
        System.out.println("Size: " + size);
    }
}

