class Employee {
    protected String name;
    protected double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("John Doe");
        manager.setSalary(5000.0);
        manager.setDepartment("Sales");
        manager.display();
    }
}

