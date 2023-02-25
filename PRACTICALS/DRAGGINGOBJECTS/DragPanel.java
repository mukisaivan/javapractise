package PRACTICALS.DRAGGINGOBJECTS;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;

import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Point;

public class DragPanel extends JPanel {
    

    ImageIcon image = new ImageIcon("PRACTICALS/DRAGGINGOBJECTS/ball.png");

    final int WIDTH = image.getIconWidth();        // this made final because we s=dont plan on the image changing size anytime 
    final int HEIGHT = image.getIconHeight();

    Point imageCorner;   // this is to track the point at which the image is
    Point prevPoint;

    DragPanel() {

        imageCorner = new Point(0, 0); // setting the initial point of the image
        
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }
    
    
    //  this method helps to paint the image at each corner

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }
    

    // this method updates the next point where the image will be created

    private class ClickListener extends MouseAdapter { // note: only classes extends

        public void mousePressed(MouseEvent e) {
            prevPoint = e.getPoint();
        }
    }
    
    
    private class DragListener extends MouseMotionAdapter {
        
        public void mouseDragged(MouseEvent e) {

            Point currentPt = e.getPoint();

            imageCorner.translate(

                (int)(currentPt.getX() - prevPoint.getX()),
                (int)(currentPt.getY() - prevPoint.getY())

            );

            prevPoint = currentPt;
            repaint();

        }

    }


    
}
