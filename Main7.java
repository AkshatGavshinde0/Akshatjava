class Shape {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Red");
        circle.setRadius(5.0);
        circle.display();
    }
}

