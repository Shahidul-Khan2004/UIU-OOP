package CT3_Practice.Lab_Practice_Sheet_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Gui extends JFrame implements ActionListener {

    JTextArea num1;
    JTextArea num2;
    JLabel result;

    Gui() {
        setTitle("Calculator");
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(750, 300);

        num1 = new JTextArea();
        num2 = new JTextArea();
        num1.setBounds(50, 50, 175, 100);
        num2.setBounds(275, 50, 175, 100);
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        plus.setBounds(50, 200, 175, 100);
        minus.setBounds(275, 200, 175, 100);
        plus.setFont(new Font("Times New Roman", Font.BOLD, 20));
        minus.setFont(new Font("Times New Roman", Font.BOLD, 20));
        plus.addActionListener(this);
        minus.addActionListener(this);
        result =  new JLabel();
        result.setBounds(150, 350, 200, 100);
        result.setVerticalAlignment(JLabel.CENTER);
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setFont(new Font("Times New Roman", Font.BOLD, 20));

        add(num1);
        add(num2);
        add(plus);
        add(minus);
        add(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+")) {
            result.setText(Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText()) + "");
        }
        else if (e.getActionCommand().equals("-")) {
            result.setText(Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText()) + "");
        }
    }
}

public class Second {
    public static void main(String[] args) {
        new Gui();
    }
}
