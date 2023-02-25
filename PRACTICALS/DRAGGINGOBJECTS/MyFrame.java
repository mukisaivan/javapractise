package PRACTICALS.DRAGGINGOBJECTS;


import java.awt.Color;

import javax.swing.JFrame;




public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();
    
    MyFrame() {


        this.setVisible(true);
        this.setBounds(0, 0, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setForeground(Color.BLACK);
        
        this.add(dragPanel);
        

    }


}
