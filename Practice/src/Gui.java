import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class action implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
}

public class Gui {
    Gui() {
        JFrame frame = new JFrame("My GUI");
        JLabel title = new JLabel("My GUI");
        JButton button = new JButton("Click Me");

        frame.setSize(400, 400);
        title.setBounds(100, 100, 200, 20);
        button.setBounds(150, 150, 100, 40);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(title);
        frame.add(button);

        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setHorizontalAlignment(JLabel.CENTER);
        button.addActionListener(new action());
    }
    public static void main(String[] args) {
        new Gui();
    }
}