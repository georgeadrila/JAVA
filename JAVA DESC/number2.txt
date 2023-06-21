import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton buttonAdd, buttonSub, buttonMul, buttonDiv, buttonClear, buttonEqual;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(4, 4));

        button7 = new JButton("7");
        button7.addActionListener(this);
        panelButtons.add(button7);

        button8 = new JButton("8");
        button8.addActionListener(this);
        panelButtons.add(button8);

        button9 = new JButton("9");
        button9.addActionListener(this);
        panelButtons.add(button9);

        buttonDiv = new JButton("/");
        buttonDiv.addActionListener(this);
        panelButtons.add(buttonDiv);

        button4 = new JButton("4");
        button4.addActionListener(this);
        panelButtons.add(button4);

        button5 = new JButton("5");
        button5.addActionListener(this);
        panelButtons.add(button5);

        button6 = new JButton("6");
        button6.addActionListener(this);
        panelButtons.add(button6);

        buttonMul = new JButton("*");
        buttonMul.addActionListener(this);
        panelButtons.add(buttonMul);

        button1 = new JButton("1");
        button1.addActionListener(this);
        panelButtons.add(button1);

        button2 = new JButton("2");
        button2.addActionListener(this);
        panelButtons.add(button2);

        button3 = new JButton("3");
        button3.addActionListener(this);
        panelButtons.add(button3);

        buttonSub = new JButton("-");
        buttonSub.addActionListener(this);
        panelButtons.add(buttonSub);

        button0 = new JButton("0");
        button0.addActionListener(this);
        panelButtons.add(button0);

        buttonClear = new JButton("C");
        buttonClear.addActionListener(this);
        panelButtons.add(buttonClear);

        buttonEqual = new JButton("=");
        buttonEqual.addActionListener(this);
        panelButtons.add(buttonEqual);

        buttonAdd = new JButton("+");
        buttonAdd.addActionListener(this);
        panelButtons.add(buttonAdd);

        add(panelButtons, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == button7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == button8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == button9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == buttonAdd) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        } else if (e.getSource() == buttonSub) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        } else if (e.getSource() == buttonMul) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        } else if (e.getSource() == buttonDiv) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        } else if (e.getSource() == buttonClear) {
            textField.setText("");
        } else if (e.getSource() == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(Double.toString(result));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
