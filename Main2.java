class Person2 {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }
}

public class Main2 {
  public static void main(String[] args) {
    Person2 p = new Person2();
    p.setName("John");
    System.out.println(p.getName());
  }
}

