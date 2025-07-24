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
            System.out.println("Like many before you. You have failed!");
            System.exit(2);
        }

        System.out.println("How surprising, you have passed the first challenge.");
        double radius = Math.round(rd.nextDouble(1.1,10) * 100) / 100.0;
        double area = Math.round(Math.PI * Math.pow(radius, 2) * 100) / 100.0;
        System.out.printf("The area of the circle with a radius of %.2fm is: ", radius);
        double inArea = sc.nextDouble();
        sc.nextLine();
        if (inArea != area) {
            System.out.println("Like many before you. You have failed!");
            System.exit(4);
        }

        System.out.println("You've impressed me challenger!\nMay I know your name?");
        String Name = sc.nextLine();
        String vowels = "aeiou";
        boolean chosen = false;
        for (int i = 0; i < vowels.length(); i++) {
            if(Name.contains(vowels.charAt(i)+"")) //same as Name.contains(Character.toString(vowels.charAt(i))
            {
                chosen = true; break;
            }
        }
        if(!chosen) {
            System.out.println("You are not one of the chosen");
            System.exit(6);
        }
        System.out.println("You are one of the chosen ones.\nBut your trials are far from over!");

        sc.close();
    }
}
