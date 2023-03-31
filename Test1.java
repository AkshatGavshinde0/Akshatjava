class Animaal {
  void sound() {
    System.out.println("Animal is making a sound");
  }
}

class Ddog extends Animaal {
  void sound() {
    System.out.println("Dog is barking");
  }
}

class Ccat extends Animaal {
  void sound() {
    System.out.println("Cat is meowing");
  }
}

class Test1 {
  public static void main(String args[]) {
    Animaal a;
    a = new Ddog();
    a.sound();
    a = new Ccat();
    a.sound();
  }
}

