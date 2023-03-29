public class Vehicle {
    String make;
    String model;
    int year;

    // default constructor
    public Vehicle() {
        this("Unknown", "Unknown", 0);
    }

    // constructor with one argument
    public Vehicle(String make) {
        this(make, "Unknown", 0);
    }

    // constructor with two arguments
    public Vehicle(String make, String model) {
        this(make, model, 0);
    }

    // parameterized constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        // creating objects using different constructors
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Honda");
        Vehicle v3 = new Vehicle("Toyota", "Camry");
        Vehicle v4 = new Vehicle("Ford", "Mustang", 2020);

        System.out.println("v1: make=" + v1.make + ", model=" + v1.model + ", year=" + v1.year);
        System.out.println("v2: make=" + v2.make + ", model=" + v2.model + ", year=" + v2.year);
        System.out.println("

