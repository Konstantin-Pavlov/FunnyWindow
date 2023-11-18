import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();

        // Set the window size
        int width = 600;
        int height = 400;

        gui.setSize(width, height);

        // Center the frame on the screen
        centerFrameOnScreen(gui);

        // Make the window visible
        gui.setVisible(true);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void centerFrameOnScreen(JFrame frame) {

        // get screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the X and Y coordinates to center the window
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;

        frame.setLocation(x, y);
    }
}