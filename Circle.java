public class Circle {
    static double PI;
    int radius;

    // static initialization block
    static {
        PI = 3.14159;
    }

    // parameterized constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        // creating object using parameterized constructor
        Circle c = new Circle(5);
        System.out.println("Area: " + c.getArea());
    }
}

