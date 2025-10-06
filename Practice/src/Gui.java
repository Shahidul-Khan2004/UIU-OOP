import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI Application");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        JLabel title = new JLabel("My GUI Application");
        title.setBounds(0,0, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(title);
    }
}