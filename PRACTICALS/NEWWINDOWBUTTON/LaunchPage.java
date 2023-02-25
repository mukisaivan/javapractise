package PRACTICALS.NEWWINDOWBUTTON;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    
    

    JButton button = new JButton("open new window");;
    JFrame frame = new JFrame();


    LaunchPage() {
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setTitle("LAUNCH PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        button.setBounds(100, 100, 250, 50);
        button.setText("launch next window");
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            new NewWindow();

            frame.dispose();

        }

    }

    



}

    

