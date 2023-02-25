package BASICSPROGRAMMING;
import java.util.ArrayList;

public class twoDarraylists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("breads");
        bakeryList.add("mandazi");
        bakeryList.add("donuts");


        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("tomatoes");
        produceList.add("zuzcchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("soda");
        drinksList.add("coffee");
        drinksList.add("beer");

        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        groceryList.add(produceList);


        System.out.println(groceryList.get(0));
        



    }
}
