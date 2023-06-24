import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        System.out.println("Before removal: " + hashSet);

        hashSet.remove(20);

        System.out.println("After removal: " + hashSet);
    }
}

