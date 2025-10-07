package CT3_Practice.Lab_Practice_Sheet_3.First;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Change implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == GUI.buttonp) {
            GUI.n++;
            GUI.label.setText(""+GUI.n);
        }
        else if(e.getSource() == GUI.buttonm) {
            GUI.n--;
            GUI.label.setText(""+GUI.n);
        }
    }
}

class GUI{
    public static int n = 10;
    public static JLabel label;
    static JButton buttonp;
    static JButton buttonm;
    GUI(){
        JFrame frame = new JFrame("Counter");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        label = new JLabel(n + "");
        label.setBounds(100,80,200,80);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setBorder(BasicBorders.getTextFieldBorder());

        buttonp = new JButton("+");
        buttonp.setBounds(50,240,125,80);

        buttonm = new JButton("-");
        buttonm.setBounds(225,240,125,80);

        Change al = new Change();
        buttonp.addActionListener(al);
        buttonm.addActionListener(al);

        frame.add(label);
        frame.add(buttonp);
        frame.add(buttonm);
    }
}

public class First {
    public static void main(String[] args) {
        new GUI();
    }
}
