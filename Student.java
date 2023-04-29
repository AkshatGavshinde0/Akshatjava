public class Student {
    String name;
    int rollNo;
    double marks;

    // parameterized constructor
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // constructor overloading with one argument
    public Student(String name) {
        this(name, 0, 0.0);
    }

    public static void main(String[] args) {
        // creating objects using different constructors
        Student s1 = new Student("John", 101, 80.0);
        Student s2 = new Student("Mike");
        
        System.out.println("s1: name=" + s1.name + ", rollNo=" + s1.rollNo + ", marks=" + s1.marks);
        System.out.println("s2: name=" + s2.name + ", rollNo=" + s2.rollNo + ", marks=" + s2.marks);
    }
}

