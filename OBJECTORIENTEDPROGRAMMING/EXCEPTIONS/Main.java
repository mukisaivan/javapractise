package OBJECTORIENTEDPROGRAMMING.EXCEPTIONS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            


            System.out.println("enter your first number to divde: ");
            int x = scanner.nextInt();

            System.out.println("enter your second number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Answer:" +z);
        }

        catch (ArithmeticException e) {
            System.out.println("EXCEPTION: you can not divide a number by zero");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        
        finally{
            System.out.println("this ill always print");
            scanner.close();
        }

        

    }
}
