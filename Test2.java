class Shaape {
  void draw() {
    System.out.println("Drawing Shape");
  }
}

class Recctangle extends Shaape {
  void draw() {
    System.out.println("Drawing Rectangle");
  }
}

class Ciircle extends Shaape {
  void draw() {
    System.out.println("Drawing Circle");
  }
}

class Test {
  public static void main(String args[]) {
    Shaape s = new Recctangle();
    s.draw();
    s = new Ciircle();
    s.draw();
  }
}

