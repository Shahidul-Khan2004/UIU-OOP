package CT4_Practice;

import javax.swing.*;

class MainFrame extends JFrame
{
	MainFrame(String title)
	{
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        JMenu m = new JMenu("File");
        JMenuItem New = new JMenuItem("New");
        JMenuItem Open = new JMenuItem("Open");
        JMenuItem close = new JMenuItem("Close");
        JMenuItem quit = new JMenuItem("Quit");
        JMenu m1 = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenu sp = new JMenu("Special");
        JMenuItem first = new JMenuItem("First");
        JMenuItem second = new JMenuItem("Second");
        JCheckBoxMenuItem Debug = new JCheckBoxMenuItem("Debug");
        JCheckBoxMenuItem Testing = new JCheckBoxMenuItem("Testing");
        m.add(New);
        m.add(Open);
        m.add(close);
        m.addSeparator();
        m.add(quit);
        m1.add(cut);
        m1.add(copy);
        m1.add(paste);
        m1.addSeparator();
        sp.add(first);
        sp.add(second);
        m1.add(sp);
        m1.add(Debug);
        m1.add(Testing);
        mbar.add(m);
        mbar.add(m1);
        setVisible(true);
    }
}

public class EX0 {
    public static void main(String[] args) {
        new MainFrame("Menu Example");
    }
}
