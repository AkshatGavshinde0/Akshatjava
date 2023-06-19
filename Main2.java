class Vehicle {
    public void startEngine() {
        System.out.println("Starting the vehicle's engine");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Motorcycle();
        vehicle1.startEngine();
        vehicle2.startEngine();
    }
}

