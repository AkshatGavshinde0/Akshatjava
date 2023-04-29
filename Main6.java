class Bank {
  String name;
  Bank(String name) {
    this.name = name;
  }
}

class Employee {
  String name;
  Employee(String name) {
    this.name = name;
  }
  void workForBank(Bank b) {
    System.out.println(name + " is working for " + b.name + ".");
  }
}

public class Main6 {
  public static void main(String[] args) {
    Bank b = new Bank("ABC Bank");
    Employee e = new Employee("John");
    e.workForBank(b);
  }
}

