package FileIOPractice.Final251;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\Code\\UIU-OOP\\Practice\\src\\FileIOPractice\\Final251\\input.txt");
            FileWriter fwi = new FileWriter("D:\\Code\\UIU-OOP\\Practice\\src\\FileIOPractice\\Final251\\info.txt", true);
            FileWriter fwm = new FileWriter("D:\\Code\\UIU-OOP\\Practice\\src\\FileIOPractice\\Final251\\mark.txt", true);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fwi);
            BufferedWriter bm = new BufferedWriter(fwm);
            String[] info;
            String line;
            while ((line = br.readLine()) != null) {
                info = line.split(" ");
                bw.write(info[0] + " " + info[1]);
                bw.newLine();
                int sum = Integer.parseInt(info[2]) + Integer.parseInt(info[3]);
                bm.write(info[1] + " " + sum);
                bm.newLine();
            }
            br.close();
            bw.close();
            bm.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
