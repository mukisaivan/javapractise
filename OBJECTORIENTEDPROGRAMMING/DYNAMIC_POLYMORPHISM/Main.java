package OBJECTORIENTEDPROGRAMMING.DYNAMIC_POLYMORPHISM;

import java.util.Scanner;

public class Main {

    //dynamic =  after compilation (during runtime)


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Choose the animal you want");

        System.out.println("(1 = dog) or (2 = cat): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.Speak();
        }

        else if (choice == 2) {
            animal = new Cat();
            animal.Speak();
        } else {
            System.out.println("you choice is invalid");
        }
        
        scanner.close();
    }
    
}
