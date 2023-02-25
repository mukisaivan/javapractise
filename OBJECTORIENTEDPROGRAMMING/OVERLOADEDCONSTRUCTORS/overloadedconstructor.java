package OBJECTORIENTEDPROGRAMMING.OVERLOADEDCONSTRUCTORS;

public class overloadedconstructor {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("ntake", "bichilli sauce", "paramount", "tomato") ;
      
        System.out.println("here are the contents in your pizza: ");

        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        


    }
}
