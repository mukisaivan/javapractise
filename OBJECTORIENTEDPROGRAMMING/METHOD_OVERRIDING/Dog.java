package OBJECTORIENTEDPROGRAMMING.METHOD_OVERRIDING;

public class Dog extends Animal {

    //this speak function is copped from animal class so that the dog class can also havee its own interpretation of the method speak
    
    @Override
    void speak() {
        System.out.println("Then dog goes *bark*");
    }
    
}
