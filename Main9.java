class Car {
  String model;
  Engine e;
  Car(String model, Engine e) {
    this.model = model;
    this.e = e;
  }
}

class Engine {
  String type;
  Engine(String type) {
    this.type = type;
  }
}

public class Main9 {
  public static void main(String[] args) {
    Engine e = new Engine("Diesel");
    Car c = new Car("Audi", e);
  }
}

