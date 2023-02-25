package xLASTLESSONS.SERIAL.SERIALISATION;

import java.io.Serializable;

public class User implements Serializable {
    
    public String name;
    public String password;



    public void greet() {
        
        System.out.println("Hello "+name);
    }
}
