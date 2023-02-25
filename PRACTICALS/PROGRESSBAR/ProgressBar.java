package PRACTICALS.PROGRESSBAR;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    ProgressBar() { 

        frame = new JFrame("HEALTH PROGRESS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);        // when using the layout manager, always use the bar.setbounds
        frame.setVisible(true);
        frame.setSize(400, 400);



        bar = new JProgressBar();
        bar.setValue(0);     // this is the initial value the bar is filled
        bar.setBounds(0, 20, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 20));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.black);


        frame.add(bar);


        fill();       // this method is called here so that to fill the bar 
        
    }

    public void fill() {
        int counter = 100;

        while (counter > 0) {

            bar.setValue(counter);
            // Thread.sleep(1000);  -->> this is the formula to increment consistently, 1000 means by 1 second

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            counter -= 1;
        }

        bar.setString("Done! :)");


    }

}
