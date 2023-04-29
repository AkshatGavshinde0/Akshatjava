interface Printable {
  void print();
}

class Document implements Printable {
  public void print() {
    System.out.println("Printing a document.");
  }
}

public class Main4 {
  public static void main(String[] args) {
    Printable p = new Document();
    p.print();
  }
}

