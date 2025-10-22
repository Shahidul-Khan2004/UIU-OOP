package FileIOPractice.One;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String firstFile = sc.nextLine();
        String secondFile = sc.nextLine();
        String outputFile = sc.nextLine();
        try {
            BufferedReader first = new BufferedReader(new FileReader(firstFile));
            BufferedReader second = new BufferedReader(new FileReader(secondFile));
            BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = first.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            while ((line = second.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            out.close();
            first.close();
            second.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File where? -_-");
        }
    }
}
