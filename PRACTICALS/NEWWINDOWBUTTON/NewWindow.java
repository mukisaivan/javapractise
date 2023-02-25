package PRACTICALS.NEWWINDOWBUTTON;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    

    JFrame frame = new JFrame();
    JLabel label = new JLabel("hey tsup");

    NewWindow(){
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setTitle("LAUNCH PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(0, 0, 100, 50);
        

        frame.add(label);

    }


    

}

  