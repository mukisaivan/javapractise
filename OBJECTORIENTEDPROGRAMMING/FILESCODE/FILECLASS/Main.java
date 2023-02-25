package OBJECTORIENTEDPROGRAMMING.FILESCODE.FILECLASS;


import java.io.File;

public class Main {

    //file = an abstract repressentation of a file and directory pathnames

    public static void main(String[] args) {
        
        File file = new File("SECRETMESSAGE.txt");

        if (file.exists()) {
            System.out.println("this file exists");
            System.out.println(file.getAbsolutePath());

        }
        else {
            System.out.println("this file does not exist");
        }

    }
}
