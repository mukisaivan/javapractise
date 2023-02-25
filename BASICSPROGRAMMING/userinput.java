package BASICSPROGRAMMING;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("whats your name?: ");
            String name = scanner.nextLine();

            System.out.println("whats your age?: ");
            int age = scanner.nextInt();
            scanner.nextLine();   //this creates a new line where the user inputs

            System.out.println("whats your favourite food ");
            String food = scanner.nextLine();


            System.out.println("hello " + name);
            System.out.println("you are " + age + " years old!");
            System.out.println("you like "+food);
        }
        

    }
   

    
    
}
