package PRACTICALS.ANIMATIONS;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame() {
        
        panel = new MyPanel();

        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setVisible(true);
    }

}
