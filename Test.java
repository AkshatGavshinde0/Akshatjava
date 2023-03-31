class Persons {
  String name;
  
  Persons(String n) {
    name = n;
  }
  
  void display() {
    System.out.println("Name: " + name);
  }
}

class Employeee extends Persons {
  float salary;
  
  Employeee(String n, float s) {
    super(n);
    salary = s;
  }
  
  void display() {
    super.display();
    System.out.println("Salary: " + salary);
  }
}

class Test {
  public static void main(String args[]) {
    Employeee e = new Employeee("John", 50000);
    e.display();
  }
}

