package PRACTICALS.FLOWLAYOUT;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));   // this ensures that whatever is printed is printed on the frame  by setting the frame as the layout


        frame.add(new JButton("1"));   // short cut for adding many buttons in the frame created
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));






    }
}
