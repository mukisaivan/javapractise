package PRACTICALS.ANIMATIONS;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.*;
import java.awt.*;


public class MyPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image alien;
    Image earth;
    Timer timer;

    int xVelocity = 1;   // this adjusts how far or fast the image is moving along the x axis
    int yVelocity = 2;
    int x = 0;
    int y = 0;

    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        alien = new ImageIcon("PRACTICALS/ANIMATIONS/icons8-ufo-100.png").getImage();   // .getimage is used to full access the image to be used in other methods
        earth = new ImageIcon("PRACTICALS/ANIMATIONS/earth.jpg").getImage();

        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {

        super.paint(g);   // this sets the background to black  because the parent class "graphics g has been called through the paint method"
        
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(earth, 0, 0, null);

        g2D.drawImage(alien, x, y, null);

    }


    @Override
    public void actionPerformed(ActionEvent e) { // involves repainting to show movement action
        
        if(x >= PANEL_WIDTH- alien.getWidth(null) || x < 0){
            xVelocity = xVelocity * -1;
        }

        x = x + xVelocity; /// this changes the current coordinates of the alien
        

        if (y >= PANEL_WIDTH - alien.getWidth(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }

        y = y + yVelocity;


        repaint();


    }
}
