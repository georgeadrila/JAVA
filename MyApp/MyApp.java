package MyApp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyApp implements ActionListener {

    JFrame frame;
    JLabel label;
    JButton button;
    Random random;

    public MyApp() {
        frame = new JFrame("My App");
        label = new JLabel("Random number: ");
        button = new JButton("Click me!");
        random = new Random();

        button.addActionListener(this);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);

        frame.add(label);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int randomNumber = random.nextInt(100);
        label.setText("Random numbers: " + randomNumber);
    }

    public static void main(String[] args) {
        new MyApp();
    }
}
