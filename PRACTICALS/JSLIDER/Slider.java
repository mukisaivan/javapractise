package PRACTICALS.JSLIDER;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;

public class Slider implements ChangeListener{

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JSlider slider = new JSlider();

    Slider() {

        frame = new JFrame("mood");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,200,100);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(20);          //this is to set the spacing in the bars
        slider.setPaintTrack(true);              // this is to put stick labels on the thermometer
        slider.setPaintLabels(true); // this is to put numbers on the thermometer labels

        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText("%C = "+ slider.getValue());


        panel.add(label);
        panel.add(slider);
        frame.add(panel);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("%C = " + slider.getValue());
        
        
    }

}
