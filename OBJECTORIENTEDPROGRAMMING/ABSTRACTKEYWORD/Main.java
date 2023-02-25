package OBJECTORIENTEDPROGRAMMING.ABSTRACTKEYWORD;

public class Main {

    // the abstract keyword adds a layer of security to your program 

    //forexample the go method in the vehicle class can not be used in the Main  class


    /* 
     * NOTE 
     * abstract class cannot be instantiated 
     * they have subclass abstract without implementation
    */


    public static void main(String[] args) {
        
        Car car = new Car();

        car.go();

        // Vehicle vehicle = new Vehicle();


    }
}
