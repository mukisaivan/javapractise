package PRACTICALS.JOPTIONPANE;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        
        //JOptionPane.showMessageDialog(null, "virus detected", "error", JOptionPane.ERROR_MESSAGE);
            
        
        // String name = JOptionPane.showInputDialog(null, "what is your name");
        // System.out.println(name);

        String[] responses = {"no", "youre not there", "finished", "am done"};

        JOptionPane.showOptionDialog(null, "wow surprise", "i have you", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    }
}
