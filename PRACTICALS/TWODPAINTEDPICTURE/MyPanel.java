package PRACTICALS.TWODPAINTEDPICTURE;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    
    Image image;

    MyPanel() {

        image = new ImageIcon("PRACTICALS/TWODPAINTEDPICTURE/fjet.png").getImage();

        this.setPreferredSize(new Dimension(500,500));

    }
    
    public void paint(Graphics g) {
        // since Graphics alone is outdated we can use graphics2D whic is a child class
        // of graphics

        // so we try to cast the graphics object in the argument as a graphics2D object

        // We use graphics2d because it provides more options to draw

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.RED);
        g2D.setStroke(new BasicStroke(10));
        // g2D.drawLine(0, 0, 500, 500);
        // g2D.drawRect(50, 50, 200, 200);

        g2D.setPaint(Color.BLACK);
        g2D.fillArc(0, 0, 100, 100, 0, 180);
        g2D.setPaint(Color.RED);
        g2D.fillArc(0, 0, 100, 100, 180, 180);


        int[] xpoints = { 150, 250, 350 };
        int[] ypoints = { 300, 150, 300 };
        g2D.drawPolygon(xpoints, ypoints, 3);
        g2D.fillPolygon(xpoints, ypoints, 3);
        

        g2D.setPaint(Color.BLUE);
        g2D.setFont(new Font("mv boli", Font.BOLD, 50));
        g2D.drawString("you are a winner", 0, 400);


        g2D.drawImage(image,400 ,0 , null);

    }
}
