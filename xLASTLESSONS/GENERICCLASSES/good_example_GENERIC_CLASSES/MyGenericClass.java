package xLASTLESSONS.GENERICCLASSES.good_example_GENERIC_CLASSES;

public class MyGenericClass <Thing>{
    
    Thing x;

    MyGenericClass(Thing x) {
        this.x = x;
    }

    public Thing getValue() {
        return x;
        
    }
}

/*

        FOR TWO PARAMETERS    

        USED SO MUCH IN GENERATING HASH MAPS

public class MyGenericClass <Thing1, Thing2>{
    
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
 
*/