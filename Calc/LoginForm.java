package Calc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {
    private JLabel labelLogin, labelPassword;
    private JTextField textFieldLogin, textFieldPassword;
    private JButton buttonLogin;

    public LoginForm() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new GridLayout(3, 2));

        labelLogin = new JLabel("Login ID:");
        panelLogin.add(labelLogin);

        textFieldLogin = new JTextField();
        panelLogin.add(textFieldLogin);

        labelPassword = new JLabel("Password:");
        panelLogin.add(labelPassword);

        textFieldPassword = new JPasswordField();
        panelLogin.add(textFieldPassword);

        buttonLogin = new JButton("Login");
        buttonLogin.addActionListener(this);
        panelLogin.add(buttonLogin);

        add(panelLogin, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonLogin) {
            String loginId = textFieldLogin.getText();
            String password = textFieldPassword.getText();
            if (loginId.equals("georgeadrila") && password.equals("hellopassword")) {
                JOptionPane.showMessageDialog(this, "Login Success");
            } else {
                JOptionPane.showMessageDialog(this, "Login Fail");
            }
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}