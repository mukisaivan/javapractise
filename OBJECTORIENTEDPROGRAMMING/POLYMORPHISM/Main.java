package OBJECTORIENTEDPROGRAMMING.POLYMORPHISM;

public class Main {

    // polymorphism = many 

    //ability of an object to identify as more than one type


    public static void main(String[] args) {
        
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();


        Vehicle[] racers = { car, bicycle, boat }; // get whhat common between them

        for(Vehicle x : racers){
            x.go();
        }

    }
    
}
