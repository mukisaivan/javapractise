package PRACTICALS.CHECKBOX;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("check this out");
        this.add(checkBox);       
        this.pack();
        
        this.setLayout(new FlowLayout());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }

}
