import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerClass extends JFrame {
    private JTextField timeField;
    private JButton startButton;
    private Timer timer;
    private int remainingTime;

    public TimerClass() {
        setTitle("Обратный отсчет");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        timeField = new JTextField(10);
        startButton = new JButton("Старт");

        add(timeField);
        add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startCountdown();
            }
        });

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remainingTime--;
                if (remainingTime >= 0) {
                    timeField.setText(Integer.toString(remainingTime));
                } else {
                    timer.stop();
                    timeField.setText("Время вышло!");
                }
            }
        });
    }

    private void startCountdown() {
        try {
            remainingTime = Integer.parseInt(timeField.getText());
            timer.start();
        } catch (NumberFormatException ex) {
            timeField.setText("Введите корректное время");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TimerClass app = new TimerClass();
                app.setVisible(true);
            }
        });
    }
}
