package PRACTICALS.MENUBAR;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MyFrame extends JFrame implements ActionListener {

    // declaring items globally so that they can be recognised all over

    JMenuBar menuBar = new JMenuBar();
    
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;


    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;




    MyFrame() {
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setBounds(0,0 , 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);

        // creating the menu bar 

        JMenuBar menuBar = new JMenuBar();

        // adding items to the menu bar

        this.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("FILE");
        JMenu editMenu = new JMenu("EDIT");
        JMenu helpMenu = new JMenu("HELP");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);


        // this creates the options that are to be displayed once one presses any menu option

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");


        // creating image icons for them

        loadIcon = new ImageIcon("PRACTICALS/MENUBAR/icons/loadicon.png");
        saveIcon = new ImageIcon("PRACTICALS/MENUBAR/icons/saveicon.png");
        exitIcon = new ImageIcon("PRACTICALS/MENUBAR/icons/exiticon.png");


        


        // adding the action listeners to the options

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);


        // adding the image icons to the options 

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);


        // this sets the keyboard shortcuts that cam be used to perform an action 

        loadItem.setMnemonic(KeyEvent.VK_L);  // l for load
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);


        // this adds the options created in the menu option desired 

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("you've loaded an item bro");
        }
        
        if (e.getSource() == saveItem) {
            System.out.println("you've saved an item bro");
        }
        
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

}
