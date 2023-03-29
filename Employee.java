public class Employee {
    String name;
    int id;
    double salary;

    // parameterized constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public static void main(String[] args) {
        // creating object using parameterized constructor
        Employee e = new Employee("John", 101, 5000.0);
        System.out.println("Name: " + e.name);
        System.out.println("ID: " + e.id);
        System.out.println("Salary: " + e.salary);
    }
}

