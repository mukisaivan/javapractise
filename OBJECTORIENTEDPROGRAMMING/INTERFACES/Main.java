package OBJECTORIENTEDPROGRAMMING.INTERFACES;

public class Main {
    public static void main(String[] args) {

        //interfaces  ==   similar to inheritancec but here classes can apply more than one interface but inheritance is limited to one super


        Rabbit rabbit = new Rabbit();

        Hawk hawk = new Hawk();

        Fish fish = new Fish();

        rabbit.flee();

        hawk.hunt();

        fish.hunt();
        fish.flee();


        
    }
}
