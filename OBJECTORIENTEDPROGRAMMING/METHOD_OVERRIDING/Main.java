package OBJECTORIENTEDPROGRAMMING.METHOD_OVERRIDING;

// Method overriding is done so that the child class can have its own implementation of its that method

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Animal animal = new Animal();

        dog.speak();

        animal.speak();
    }
}
