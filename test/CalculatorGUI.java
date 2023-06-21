package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField numField1;
    private JTextField numField2;
    private JTextField resultField;

    public CalculatorGUI() {
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create input fields
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);

        // Create operator buttons
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        // Create result field
        resultField = new JTextField(10);
        resultField.setEditable(false);

        // Create panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(numField1);
        panel.add(numField2);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(resultField);

        // Add panel to the frame
        getContentPane().add(panel);

        // Add action listeners to operator buttons
        addButton.addActionListener(new OperatorButtonListener("+"));
        subtractButton.addActionListener(new OperatorButtonListener("-"));
        multiplyButton.addActionListener(new OperatorButtonListener("*"));
        divideButton.addActionListener(new OperatorButtonListener("/"));
    }

    // ActionListener for operator buttons
    private class OperatorButtonListener implements ActionListener {
        private String operator;

        public OperatorButtonListener(String operator) {
            this.operator = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
                    }
                    break;
            }

            resultField.setText(Double.toString(result));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculator = new CalculatorGUI();
            calculator.setSize(300, 150);
            calculator.setVisible(true);
        });
    }
}