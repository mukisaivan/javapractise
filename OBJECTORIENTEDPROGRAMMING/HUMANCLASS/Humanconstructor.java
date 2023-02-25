package OBJECTORIENTEDPROGRAMMING.HUMANCLASS;

public class Humanconstructor {
    public static void main(String[] args) {
        Human human1 = new Human("Jimmy", 13, 23);
        System.out.println(human1.weight);

        Human human2 = new Human("Morgan", 23, 12);
        System.out.println(human2.name);

        human2.eat();
        
    }
}
