package OBJECTORIENTEDPROGRAMMING.FILESCODE.FILEWRITER;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        FileWriter writer;
        try {
            writer = new FileWriter("poem.txt");
            writer.write("roses are red\n Vilets are blue");
            writer.close();
            writer.append("\n(a poem by mukisa)");


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
            
        

    }
}
