package OBJECTORIENTEDPROGRAMMING.INTERFACES;

public class Fish  implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("the big fish is hunting a small fish");
    }

    @Override
    public void flee() {
        System.out.println("the small fish is bbeing hunted by the big fish");
    }
    
}
