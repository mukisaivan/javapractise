package PRACTICALS.BUTTON;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    
    //used ancestor listener because action listener never worked

    //action/ ancestor listener is used as an interface to tell the button what to do

    JButton button;   // added so that it becomes global to be identified by all these methods

    MyFrame() {
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.setForeground(Color.BLACK);


        button.addActionListener(this);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("oouucch");
            button.setEnabled(false);
        }
        
    }

}
