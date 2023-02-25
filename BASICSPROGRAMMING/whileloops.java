package BASICSPROGRAMMING;
import java.util.Scanner;

public class whileloops {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = "";
            
            while (name.isBlank()) {
                System.out.print("Enter your name: ");
                name = scanner.nextLine();
            }
            System.out.println("hello "+name);
        }
    }
}
