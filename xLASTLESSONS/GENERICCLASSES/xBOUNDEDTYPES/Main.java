package xLASTLESSONS.GENERICCLASSES.xBOUNDEDTYPES;


public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 2);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 2.22);
       
       

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        
    }

}




