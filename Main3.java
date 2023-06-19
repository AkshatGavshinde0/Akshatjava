class Employee {
    public void calculateSalary() {
        System.out.println("Calculating employee's salary");
    }
}

class FullTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Calculating full-time employee's salary");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Calculating part-time employee's salary");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee();
        Employee employee2 = new PartTimeEmployee();
        employee1.calculateSalary();
        employee2.calculateSalary();
    }
}

