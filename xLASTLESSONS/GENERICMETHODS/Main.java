package xLASTLESSONS.GENERICMETHODS;

// generics =   enable types(classes , interfaces) to be paramenters when defining classes, interfaces and methods 

//              benefit  is to eliminate the need to create multibple versions of methods or classes for different data types

//              i.e they use one version for all reference data types

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "B", "Y", "E" };

        /* 
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        */

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
                



    }


//              GO FOR THIS TO RETURN EVRYTHING IN THE ARRAYS  WITHOUT REPETITION
                
public static <This> void displayArray(This[] array) {
    for (This x : array) {
        System.out.print(x + " ");

    }
    System.out.println();
}


//              TO RETURN ONLY THE FIRST ITEMS FROM THE ARRAYS 

public static <Thing>  Thing getFirst(Thing[] array) {
    return array[0];
}



}




// public class Main {
//     public static void main(String[] args) {

//         Integer[] intArray = {};

//     }
// }
