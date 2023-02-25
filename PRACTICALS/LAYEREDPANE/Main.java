package PRACTICALS.LAYEREDPANE;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {
    public static void main(String[] args) {
        

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBounds(50, 50,200, 200);
        label1.setBackground(Color.BLUE);


        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(100, 100, 200, 200);
        label2.setBackground(Color.green);



        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBounds(150, 150,200, 200);
        label3.setBackground(Color.red);



        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0 , 500, 500);

        layeredPane.add(label1, JLayeredPane.DRAG_LAYER);
        layeredPane.add(label2);
        layeredPane.add(label3, Integer.valueOf(5));

        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.add(layeredPane);




    }
    
}
