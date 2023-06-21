package Calc;

import java.awt.*;
import javax.swing.*;

public class HomeShape extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the roof
        int[] xPoints = {50, 150, 250};
        int[] yPoints = {100, 50, 100};
        Polygon roof = new Polygon(xPoints, yPoints, 3);
        g2d.setColor(Color.RED);
        g2d.fill(roof);

        // Draw the body
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 100, 200, 150);

        // Draw the door
        g2d.setColor(Color.WHITE);
        g2d.fillRect(120, 175, 60, 75);

        // Draw the doorknob
        g2d.setColor(Color.BLACK);
        g2d.fillOval(170, 215, 5, 5);

        // Draw the windows
        g2d.setColor(Color.WHITE);
        g2d.fillRect(70, 125, 50, 50);
        g2d.fillRect(180, 125, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Home Shape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 320);
        frame.setLocationRelativeTo(null);

        HomeShape home = new HomeShape();
        frame.add(home);

        frame.setVisible(true);
    }
}