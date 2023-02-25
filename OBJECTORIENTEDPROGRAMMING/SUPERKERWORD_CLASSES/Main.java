package OBJECTORIENTEDPROGRAMMING.SUPERKERWORD_CLASSES;


public class Main {
    public static void main(String[] args) {
        

        Hero hero1 = new Hero("Batman", 23, "Brains");

        Hero hero2 = new Hero("Superman", 34, "Laser");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);


        System.out.println("--------------------------");

        System.out.println(hero2.toString());

    }
}
