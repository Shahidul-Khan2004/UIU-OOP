package FileIOPractice.Three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] freq = new int[26];
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) >= 'a' && line.charAt(i) <='z' ) {
                        freq[line.charAt(i) - 'a']++;
                    }
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
