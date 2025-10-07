package Sort;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

class input extends JTextField implements Comparable<input> {

    public int compareTo(input that) {
        if(Integer.parseInt(this.getText()) >  Integer.parseInt(that.getText())) return 1;
        return -1;
    }
}

class GUI extends JFrame implements ActionListener {

    ArrayList<input> inputs;
    JLabel Sorted;

    GUI(String title) {
        super(title);

        setSize(550,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        inputs = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            inputs.add(new input());
        }

        inputs.get(0).setBounds(50, 50, 50, 50);
        inputs.get(1).setBounds(150, 50, 50, 50);
        inputs.get(2).setBounds(250, 50, 50, 50);
        inputs.get(3).setBounds(350, 50, 50, 50);
        inputs.get(4).setBounds(450, 50, 50, 50);

        JButton submit = new JButton("Submit");
        submit.setBounds(200, 150, 100, 50);
        submit.addActionListener(this);

        Sorted = new JLabel();
        Sorted.setBounds(175, 250, 150, 50);
        Sorted.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Sorted.setForeground(Color.GREEN);
        Sorted.setHorizontalAlignment(JLabel.CENTER);

        add(inputs.get(0));
        add(inputs.get(1));
        add(inputs.get(2));
        add(inputs.get(3));
        add(inputs.get(4));
        add(submit);
        add(Sorted);
    }

    public void actionPerformed(ActionEvent e) {
        Collections.sort(inputs);
        StringBuilder sorted = new StringBuilder();
        for(input i : inputs) {
            sorted.append(i.getText()+" ");
        }
        Sorted.setText(sorted.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        new GUI("Sort");
    }
}
