package PRACTICALS.JLABELS;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// JLABEL = is a GUI display area for a string of text, an image or both

public class Main {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.RED,6);
     
        JLabel label = new JLabel();

        ImageIcon image = new ImageIcon("OBJECTORIENTEDPROGRAMMING/JLABELS/tshirt.jpg");

        label.setText("hey ivan, do you know Java?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);  //set the color for the text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //sets the font style of the text to what we want 
        label.setIconTextGap(-100); // distance of te text from the label
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        label.setBorder(border); // is to set the boarder color
        // label.setBounds(100, 0, 300, 300);  //sets the cropping of the image
        

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(420, 420);

        // frame.setLayout(null);

        frame.setTitle("WHAT DAAAAA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(label);
        //frame.pack();


        

        

    }
}
