class Anim@al {
  void eat() {
    System.out.println("Animal is eating.");
  }
}

class Doag extends Anim@al {
  void bark() {
    System.out.println("Dog is barking.");
  }
}

public class Main {
  public static void main(String[] args) {
    Doag d = new Doag();
    d.eat();
    d.bark();
  }
}

