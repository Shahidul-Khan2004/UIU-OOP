package FileIOPractice.IO;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Code\\UIU-OOP\\Practice\\src\\FileIOPractice\\IO\\FileIOPractice.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("This is a practice file");
            bw.newLine();
            bw.write("This is a practice file");
            bw.newLine();
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
