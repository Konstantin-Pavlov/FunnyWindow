import java.awt.BorderLayout;

import javax.swing.WindowConstants;

public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        gui.setSize(600, 400);
        gui.setVisible(true);
    }
}