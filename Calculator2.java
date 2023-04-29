class Calculator2 {
  int add(int x, int y) {
    return x + y;
  }

  int add(int x, int y, int z) {
    return x + y + z;
  }
}

public class Main {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.add(2, 3));
    System.out.println(c.add(2, 3, 4));
  }
}

