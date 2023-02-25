package PRACTICALS.BORDERS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();



        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.LIGHT_GRAY);


        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(50, 100));
        panel3.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));


        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.CENTER);
        frame.add(panel5, BorderLayout.SOUTH);
       

    }
}
