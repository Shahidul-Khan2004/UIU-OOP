package Mid_Practice;

class MindGame {
    int a = 0;
    int b = 2;
    static int c = 0 ;
    static int d = 5;
    MindGame()
    {
        a--;
        b += 5;
        c++;
        d--;
    }
    static {
        c--;
        d += c;
    }
    {
        a = c++;
        b = b+d;
    }
    public void displayAB()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void displayCD() {
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

class Main {
    public static void main(String[]
                                    args)
    {
        MindGame.displayCD();
        MindGame m1 = new MindGame();
        m1.displayAB();
        m1.displayCD();
        MindGame.displayCD();
    }
}
