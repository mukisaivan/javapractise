package PRACTICALS.JCOLORCHOOSER;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setBounds(0, 0, 500, 500);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        

        button = new JButton("pick a color");
        button.addActionListener(this);



        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("this is some text");
        label.setOpaque(true); /// this enables color the to be seen 
        label.setFont(new Font("mv boli", Font.PLAIN, 50));
        

        this.add(label);
        this.add(button);
        this.pack();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            new JColorChooser();

            Color color = JColorChooser.showDialog(null, "PICK A COLOR", Color.BLACK);

            label.setForeground(color);    // this changes the words color
        }
        
     
       
    }

}
