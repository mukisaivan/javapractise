package OBJECTORIENTEDPROGRAMMING.ENCAPSULATION;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Chevrolete", "Camero", 2000);
        Car car2 = new Car("Benz", "Toyota", 1993);

        car2.copy(car1);  //what ever is on car 1 is copied to car 2

        System.out.println(car1);
        System.out.println(car2);
        
        System.out.println(" ");
    
        System.out.println(car1.getmake()); //the private class was inaccessible so we made public methods to make them accessible in the car class
        System.out.println(car1.getmodel());
        System.out.println(car1.getyear());

        System.out.println(" ");

        System.out.println(car2.getmake());
        System.out.println(car2.getmodel());
        System.out.println(car2.getyear());



        // car.setMake("Toyota");   this will change the result of the car make to Toyota
    
        //TO COPY CAR 2 ATRIBUTES TO CAR 1

        
   
   
    }
}
