package OBJECTORIENTEDPROGRAMMING.ARRAYOBJECTS;

public class arrayofobjects {
    public static void main(String[] args) {

        Food[] refrigerator = new Food[3]; ///this is the created array called refrigerator and the objects are food. 

        Food food1 = new Food("Cassava");
        Food food2 = new Food("Posho");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food2;

        //OR CAN BE DECLARED AS:
        /* 
         * Food [] refrigertor = {food1, food2,}
        */

        System.out.println(refrigerator[0].name);

    }
}


