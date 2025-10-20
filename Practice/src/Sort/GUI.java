package Sort;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class GUI extends JFrame implements ActionListener {
    // Inner class that wraps JTextField and implements Comparable
    private static class InputField implements Comparable<InputField> {
        JTextField textField;
        public InputField(JTextField textField) {
            this.textField = textField;
        }
        @Override
        public int compareTo(InputField other) {
            try {
                int v1 = Integer.parseInt(this.textField.getText());
                int v2 = Integer.parseInt(other.textField.getText());
                if(v1 > v2) return 1;
                else if(v1 < v2) return -1;
                return 0;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                return 0;
            }
        }
    }

    ArrayList<InputField> inputs;
    JLabel Sorted;
    JButton submit;

    public GUI(String title) {
        super(title);
        setSize(550,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        inputs = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            JTextField tf = new JTextField();
            tf.setBounds(50 + i*100, 50, 50, 50);
            InputField inputField = new InputField(tf);
            inputs.add(inputField);
            add(tf);
        }

        submit = new JButton("Submit");
        submit.setBounds(200, 150, 100, 50);
        submit.addActionListener(this);
        add(submit);

        Sorted = new JLabel();
        Sorted.setBounds(175, 250, 200, 50);
        Sorted.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Sorted.setForeground(Color.GREEN);
        Sorted.setHorizontalAlignment(JLabel.CENTER);
        add(Sorted);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submit)) {
            Collections.sort(inputs); // Uses Comparable
            String sorted = "";
            for (InputField input: inputs) {
                sorted += input.textField.getText();
            }
            Sorted.setText(sorted);
        }
    }

    public static void main(String[] args) {
        new GUI("Sort");
    }
}
