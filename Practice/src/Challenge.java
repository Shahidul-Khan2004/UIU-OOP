import java.util.Scanner;
import java.util.Random;

public class Challenge {
    final int SECRET_CODE = 1010;
    public static void main (String[] args) {
        Challenge code = new Challenge();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the secret code to access the challenge: ");
        int inCode = sc.nextInt();
        if(inCode != code.SECRET_CODE) {
            System.out.println("You are not worthy!");
            System.exit(1);
        }
        System.out.println("You are worthy!");

        Random rd = new Random();
        int width  = rd.nextInt(11, 101);
        int height = rd.nextInt(11, 101);
        System.out.println("Time for your first Challenge!");
        System.out.printf("The area of a rectangle with %dm height & %dm width is: ", height, width);
        int inResult = sc.nextInt();
        if (inResult != width * height) {
            System.out.println("Like many before you. You failed!");
            System.exit(2);
        }

        System.out.println("How surprising, you have passed the first challenge.");


        sc.close();
    }
}
