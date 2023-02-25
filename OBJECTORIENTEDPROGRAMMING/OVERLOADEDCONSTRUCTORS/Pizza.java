package OBJECTORIENTEDPROGRAMMING.OVERLOADEDCONSTRUCTORS;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;


//OVERLOADED CONSTRUCTORS   IE ONE HAS 3 INGREDIENTS AND THE OTHER HAS 4 INGREDIENTS
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

}
