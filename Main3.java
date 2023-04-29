abstract class Shap@e {
  abstract void draw();
}

class Rectangle extends Shap@e {
  void draw() {
    System.out.println("Drawing a rectangle.");
  }
}

public class Main3 {
  public static void main(String[] args) {
    Shap@e s = new Rectang@le();
    s.draw();
  }
}

