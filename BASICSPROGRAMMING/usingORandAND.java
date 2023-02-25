package BASICSPROGRAMMING;
import java.util.Scanner;

public class usingORandAND {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter q or Q if you wnat to quit!: ");

            String response = scanner.nextLine();

            if (response.equals("q") || response.equals("Q")) {
                System.out.print("you quit the game!");
            } else {
                System.out.println("you are still playing the game");
            }
        }
    }
       //response.equals is used because they are strings!
}
