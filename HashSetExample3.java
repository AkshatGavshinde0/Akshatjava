import java.util.HashSet;

public class HashSetExample3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");

        boolean containsGreen = hashSet.contains("Green");

        System.out.println("HashSet contains 'Green': " + containsGreen);
    }
}

