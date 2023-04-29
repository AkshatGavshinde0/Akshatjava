public class Animal1 {
    public void makeSound() {
        System.out.println("Animal1 is making a sound.");
    }
}

public class Cat1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

