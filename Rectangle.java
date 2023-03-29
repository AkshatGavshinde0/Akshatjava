public class Rectangle {
    int width;
    int height;

    // default constructor
    public Rectangle() {
        width = 0;
        height = 0;
    }

    // parameterized constructor with one argument
    public Rectangle(int side) {
        width = side;
        height = side;
    }

    // parameterized constructor with two arguments
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        // creating objects using different constructors
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("r1: width=" + r1.width + ", height=" + r1.height);
        System.out.println("r2: width=" + r2.width + ", height=" + r2.height);
        System.out.println("r3: width=" + r3.width + ", height=" + r3.height);
    }
}

