package xLASTLESSONS.GENERICCLASSES.good_example_GENERIC_CLASSES;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("hello");

        /* 
            note   generic classes are similar to arraylists as shown below 
            ArrayList<String> food = new ArrayList<>();
        */

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }

}

/*    

        FOR TWO PARAMETERS

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 2);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 2.22);
        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '#');
        MyGenericClass<String, Character> myString = new MyGenericClass<>("hello", '%');

       

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }

}




*/
