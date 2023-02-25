package BASICSPROGRAMMING;

public class trialtwodarrays {
    public static void main(String[] args) {
        String[][] foods = new String[2][2];

        foods[0][0] = "matoke";
        foods[0][1] = "rice";
        foods[1][0] = "yams";
        foods[1][1] = "posho";


        for (int i = 0; i < foods.length; i++) {
            System.out.println();
            for (int j = 0; j < foods[i].length; j++) {
                System.out.print(foods[i][j]+ " ");

            }


        }

    }
}
