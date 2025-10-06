import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SayHello implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Hello!");
    }
}

class Frame extends JFrame {
    Frame(int width, int height) {
        this.setTitle("My GUI");
        this.setSize(width, height);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Title extends JLabel{
    Title(String title, int x, int y, int width, int height){
        super(title);
        this.setBounds(x, y, width, height);
        this.setFont(new Font("Arial", Font.PLAIN, 30));
    }
}

class Say extends JButton{
    Say(ActionListener action,int x, int y, int width, int height){
        this.setBounds(x, y, width, height);
        this.addActionListener(action);
    }
}

public class Gui {
    public static void main(String[] args) {
        Frame frame = new Frame(400,300);
        Title title = new Title("My GUI",100,50,200,50);
        Say say = new Say(new SayHello(),175,100,50,50);

        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);

        frame.add(say);
        frame.add(title);
    }
}