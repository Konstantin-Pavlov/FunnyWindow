import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener; //прослушивает события - нажатие мышкой и тд
import java.awt.event.ActionEvent; //реагирует на события которые прослушивает ActionListener (нажатие на конпку и тд)
import javax.swing.JFrame; //само окно
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane; //всплывающее окно
import javax.swing.JPanel;

public class Gui extends JFrame {

    private JButton leftButton;
    private JButton rightButton;

    public Gui() {
        super("самая полезная в мире программа");

        // Create a JPanel for the center area
        JPanel centerPanel = new JPanel(new GridBagLayout());

        // Create a JPanel for the bottom area
        JPanel bottomPanel = new JPanel(new BorderLayout());

        // Create a JLabel object
        JLabel label = new JLabel("<html><center>Внимание!<br> \r\n" + //
                "У вас варятся пельмени.<br> \r\n" + //
                "Отравитесь от экрана и сходите на кухню, пока они не переварились.</center></html>");

        // Create GridBagConstraints to manage component positioning
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.CENTER;

        label.setHorizontalAlignment(JButton.CENTER);
        label.setVerticalAlignment(JButton.CENTER);

        // Create two JButton objects
        leftButton = new JButton("Выход");
        rightButton = new JButton("Тоже выход");

        ProcessingClass processing = new ProcessingClass();

        // Add an ActionListener to the button
        leftButton.addActionListener(processing);
        rightButton.addActionListener(processing);

        // Add the label to the center panel
        centerPanel.add(label, constraints);

        // Add the buttons to the bottom panel
        bottomPanel.add(leftButton, BorderLayout.WEST);
        bottomPanel.add(rightButton, BorderLayout.EAST);

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Add the center panel to the center area of the frame
        add(centerPanel, BorderLayout.CENTER);

        // Add the bottom panel to the bottom area of the frame
        add(bottomPanel, BorderLayout.SOUTH);

    }

    private class ProcessingClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            // Display a confirmation dialog
            int choice = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to exit?",
                    "Exit Confirmation",
                    JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                // Exit the application
                System.exit(0);
            }

        }
    }

}
