package xLASTLESSONS.SERIAL.deserial;

import java.io.Serializable;

public class User implements Serializable {
    
    String name;
    String password;



    public void greet() {
        
        System.out.println("Hello "+name);
    }
}
