package PRACTICALS.MOUSELISTENER;


import java.awt.event.*;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    ImageIcon laughing;
    ImageIcon sad;
    ImageIcon confused;

    MyFrame() {
        this.setVisible(true);
        this.setLayout(null);
        this.setBounds(0, 0, 500, 500);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);


        label = new JLabel();
        label.setBounds(0,0,100,100);
        // label.setBackground(Color.red);
        // label.setOpaque(true);

        


        label.addMouseListener(this);

        


        laughing = new ImageIcon("PRACTICALS/MOUSELISTENER/laughing.png");
        sad = new ImageIcon("PRACTICALS/MOUSELISTENER/crying.png");
        confused = new ImageIcon("PRACTICALS/MOUSELISTENER/confused.png");

        label.setIcon(confused);

        this.add(label);
    }
    


    @Override
    public void mouseClicked(MouseEvent e) {
        // ivoked when mouse has been clicked (pressed and released)
        
        // System.out.println("you clicked the mouse");
        

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // when mouse has been pressed on a component 
        label.setIcon(sad);;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // when mouse has been released on a component
    
        label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // when mouse enters a component

        label.setIcon(laughing);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // when mouse exits a component

            label.setIcon(confused);
        
    }

}
