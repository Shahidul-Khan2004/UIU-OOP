package FileIOPractice.Three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int[] freq = new int[26];
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            int ch;
            while ((ch = br.read()) != -1) {
                ch = Character.toLowerCase((char)ch);
                if (ch >= 'a' && ch <= 'z') {
                    freq[ch - 'a']++;
                }

            }
            br.close();
            for(int i = 0; i < freq.length; i++){
                if (freq[i] > 0){
                    System.out.println((char) (i + 'a') + " -> " + freq[i]);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
