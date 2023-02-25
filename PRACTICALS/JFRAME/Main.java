package PRACTICALS.JFRAME;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// creating a j frame where we can add components to!!!!!

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setTitle("WHAT DAAAAA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        ImageIcon image = new ImageIcon("OBJECTORIENTEDPROGRAMMING/JFRAME/muki.jpeg");  //creates an image icon
        frame.setIconImage(image.getImage()); //changes the icon of the frame

        frame.getContentPane().setBackground(Color.GREEN); //change color of background
        
    }
}
