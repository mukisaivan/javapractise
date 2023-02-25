package PRACTICALS.TWODPAINTEDPICTURE;

import javax.swing.JFrame;



public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(rootPane);
        this.setVisible(true);

    }


    

}
