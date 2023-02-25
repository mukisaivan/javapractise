package BASICSPROGRAMMING;
public class overloadedmethods {
    // these are methods that have the same name but different parameters
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;

        System.out.println(add(a,b,c,d));

    }
    
    static int add(int a, int b) {
        return a + b;
    }
    
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
