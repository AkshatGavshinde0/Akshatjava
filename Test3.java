interface Vehhicle {
  void run();
}

class Caar implements Vehhicle {
  public void run() {
    System.out.println("Car is running");
  }
}

class Test3 {
  public static void main(String args[]) {
    Vehhicle v = new Caar();
    v.run();
  }
}

