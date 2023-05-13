import java.util.PriorityQueue;

public class CustomObjectPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Person> pq = new PriorityQueue<>();
        pq.add(new Person("Alice", 25));
        pq.add(new Person("Bob", 30));
        pq.add(new Person("Charlie", 20));
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
    
    static class Person implements Comparable<Person> {
        String name;
        int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public int compareTo(Person other) {
            return Integer.compare(this.age, other.age);
        }
        
        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}

