public interface Shape1 {
    void draw();
}

public class Circle1 implements Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Square1 implements Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class ShapeDrawer1 {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

