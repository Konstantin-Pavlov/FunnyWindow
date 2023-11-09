import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.WindowConstants;

public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();

        //gui.setLayout(new java.awt.FlowLayout());

        // get screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Set the window size
        int width = 600;
        int height = 400;

        // Calculate the X and Y coordinates to center the window
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;

        gui.setSize(width, height);
        gui.setLocation(x, y);

        // Make the window visible
        gui.setVisible(true);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}