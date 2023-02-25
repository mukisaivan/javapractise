package PRACTICALS.JCOMBOBOX;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame<E> extends JFrame implements ActionListener {


    JComboBox <String>comboBox;

    MyFrame() {
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setBounds(0,0 , 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[]  animals = { "dog", "cat", "elephant" };
        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);

        this.add(comboBox);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());

        }
        
    }

}
