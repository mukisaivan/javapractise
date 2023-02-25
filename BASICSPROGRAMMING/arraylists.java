package BASICSPROGRAMMING;
import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

}
