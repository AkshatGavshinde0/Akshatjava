import java.util.HashSet;

public class HashSetExample4 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(15);

        int size = hashSet.size();

        System.out.println("Size of the HashSet: " + size);
    }
}

