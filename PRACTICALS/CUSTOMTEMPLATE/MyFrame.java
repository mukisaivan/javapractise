package PRACTICALS.CUSTOMTEMPLATE;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JFrame;




public class MyFrame extends JFrame implements ActionListener {

    MyFrame() {
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setBounds(0, 0, 500, 500);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        



    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
       
    }

}
