package PRACTICALS.KEYLISTENERS;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class MyFrame extends JFrame implements KeyListener { // here we use keylistener

    
    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setVisible(true);
        this.setLayout(null); ///set to null because we are manually gona be moving components  throught he frame 
        
       
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100); // set bounds is used because we have noot used any layout manager
        //label.setBackground(Color.orange);
        //label.setOpaque(true);

        icon = new ImageIcon("PRACTICALS\\KEYLISTENERS\\icons\\ball.png");
        
        label.setIcon(icon);


        this.add(label);


        this.getContentPane().setBackground(Color.BLACK);



    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keytyped is invoked when a key is typed , uses  KeyChar, char output

        switch (e.getKeyChar()) {
            case 'a': 
                label.setLocation(label.getX()-10, label.getY());
                break;
            
            case 'd':
                label.setLocation(label.getX()+10, label.getY());
                break;
            
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;

            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
        }




    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keypressed is invoked when a physical key is pressed down , uses KeyCode,  int output
        
        switch (e.getKeyCode()) {   // this is set to getKeyCode
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;

            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;

            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;

            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased called when ever a button is released

        System.out.println("key released: " + e.getKeyChar());
        System.out.println("code of key released: " + e.getKeyCode());
       
        
    }


}
