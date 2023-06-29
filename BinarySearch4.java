public class BinarySearch4 {
    public static class Student implements Comparable<Student> {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.id, other.id);
        }
    }

    public static int binarySearch(Student[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid].getId() == key)
                return mid;

            if (arr[mid].getId() < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        Student[] arr = {
            new Student("John", 101),
            new Student("Alice", 102),
            new Student("Bob", 103),
            new Student("Jane", 104),
        };

        int key = 103;
        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index " + result);
    }
}

