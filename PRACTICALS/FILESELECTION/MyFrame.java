package PRACTICALS.FILESELECTION;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;




public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame() {
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setBounds(0, 0, 500, 500);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        


        button = new JButton("SELECT FILE ! ");
        button.addActionListener(this);

        this.add(button);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser(); // initiating the file chooser
            
            int response = fileChooser.showOpenDialog(null); // this selects the file to open
            
            // fileChooser.showSaveDialog(fileChooser);    this is used to save a file but it doesnt really save coz theres no file created to be saved

            // filechooser.setcurrentdirectory(new File("."))   // this is used to customise the default location to be shown when opening and saving files


            if (response == JFileChooser.APPROVE_OPTION) {
                
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                System.out.println(file);
            }
            




        }
       
    }

}
