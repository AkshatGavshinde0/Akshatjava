public class BubbleSort5 {
    public static class Student {
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
    }

    public static void bubbleSort(Student[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getId() > arr[j + 1].getId()) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] arr = {
            new Student("John", 101),
            new Student("Alice", 103),
            new Student("Bob", 102)
        };

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (Student student : arr) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
    }
}

