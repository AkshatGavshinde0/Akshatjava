class Person {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    private int rollNumber;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setRollNumber(12345);
        student.display();
    }
}

