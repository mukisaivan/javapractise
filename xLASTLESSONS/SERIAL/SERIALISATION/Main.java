package xLASTLESSONS.SERIAL.SERIALISATION;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*

serialisation is the converting of an object into a byte stream
deserialisation is the opposite eg in networks

*/
 


public class Main {

    public static void main(String[] args) throws IOException {
        
        User user = new User();

        user.name = "Ivan";
        user.password = "watisgoinon";


        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();

        fileOut.close();

        System.out.println("object info has been saved! ");



    }
}
