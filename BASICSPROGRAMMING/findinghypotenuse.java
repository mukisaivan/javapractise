package BASICSPROGRAMMING;
import java.util.Scanner;
import java.lang.Math;

public class findinghypotenuse {
    public static void main(String[] args) {
        System.out.println("Enter the height: ");
        try (Scanner scanner = new Scanner(System.in)) {
            double height = scanner.nextDouble();

            System.out.println("Enter the base: ");
            try (Scanner scanner2 = new Scanner(System.in)) {
                double base = scanner2.nextDouble();

                height *= height;
                base *= base;

                double hypotenuse = Math.sqrt(base + height);

                System.out.println("Hypotenuse: "+hypotenuse);
            }
        }

    }

        
}
