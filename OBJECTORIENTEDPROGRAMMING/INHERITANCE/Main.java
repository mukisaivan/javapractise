package OBJECTORIENTEDPROGRAMMING.INHERITANCE;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        
        bicycle.moving(); //inherited from vehicle by extending it on the bicycle class 

        System.out.println(car.doors+" doors");

    }
}
