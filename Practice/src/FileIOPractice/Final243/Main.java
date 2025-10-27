package FileIOPractice.Final243;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\Code\\UIU-OOP\\Practice\\src\\FileIOPractice\\Final243\\input.txt");
            FileWriter fw = new FileWriter("D:\\Code\\UIU-OOP\\Practice\\src\\FileIOPractice\\Final243\\output.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                if (ch >= '0' && ch <= '9') {
                    fw.write(ch);
                }
            }
            fr.close();
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
