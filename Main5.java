class Engine {
  void start() {
    System.out.println("Engine is starting.");
  }
}

class Car {
  Engine e = new Engine();
  void start() {
    e.start();
  }
}

public class Main5 {
  public static void main(String[] args) {
    Car c = new Car();
    c.start();
  }
}

