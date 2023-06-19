class Vehicle {
    protected String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.display();
    }
}

