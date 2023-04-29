class Rectangle {
  int length;
  int width;

  Rectangle() {
    length = 0;
    width = 0;
  }

  Rectangle(int l, int w) {
    length = l;
    width = w;
  }

  int area() {
    return length * width;
  }
}

public class Main12 {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(5, 10);
    System.out.println(r1.area());
    System.out.println(r2.area());
  }
}

