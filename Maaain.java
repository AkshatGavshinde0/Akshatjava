class An@imal {
  void makeSound() {
    System.out.println("Animal is making a sound.");
  }
}

class Ddog extends An@imal {
  void makeSound() {
    System.out.println("Dog is barking.");
  }
}

public class Maaain {
  public static void main(String[] args) {
    An@imal a = new Ddog();
    a.makeSound();
  }
}

