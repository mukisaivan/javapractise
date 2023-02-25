package xLASTLESSONS.GENERICCLASSES.xBOUNDEDTYPES;


public class MyGenericClass <Thing1 extends Number, Thing2 extends Number>{
    
    Thing1 x;
    Thing2 y;

    MyGenericClass(Thing1 x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue() {
        return y;
        
    }
}
 
