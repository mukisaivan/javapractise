package xLASTLESSONS.SERIAL.deserial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main_deserial {
    public static void main(String[] args) throws IOException, ClassNotFoundException  {
        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\IVAN\\Desktop\\practise\\java\\xLASTLESSONS\\SERIAL\\SERIALISATION\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
 
        user = (User) in.readObject();
        in.close();
        fileIn.close();


        System.out.println(user.name);
        System.out.println(user.password);




    }
}
