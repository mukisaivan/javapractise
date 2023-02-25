package BASICSPROGRAMMING;
public class twodarrays {
    public static void main(String[] args) {
        //a 2d array is an array of arrays

        String[][] cars = new String[3][3];

        /*ANOTHER WAY OF DECLARING 2D ARRAY:
         * 
         * String[][] cars = {
         *              {"Benz", "Pajero", "tx"},
         *              {"volkswgen", "fielder", "spacio"},
         *              {"hammer", "tesla", "ford"}
         * }
         */

        cars[0][0] = "Benz";
        cars[0][1] = "Pajero";
        cars[0][2] = "tx";
        cars[1][0] = "volkswaggen";
        cars[1][1] = "fielder";
        cars[1][2] = "Spacio";
        cars[2][0] = "Hammer";
        cars[2][1] = "tesla";
        cars[2][2] = "ford";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+ " ");
            }
        }

    }
}