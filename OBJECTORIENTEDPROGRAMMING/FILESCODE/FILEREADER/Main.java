package OBJECTORIENTEDPROGRAMMING.FILESCODE.FILEREADER;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    //file reader =  reads the contents of the file 

    //               when read() returns -1, there is no more data to be read

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("OBJECTORIENTEDPROGRAMMING/FILESCODE/FILEREADER/art.txt");
            
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            
            reader.close();
 
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}
