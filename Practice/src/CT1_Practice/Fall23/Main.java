package CT1_Practice.Fall23;

public class Main {
    public static void main(String[] args)
    {
        Logarithm log1 = new Logarithm(2, 9);
        Logarithm log2 = new Logarithm(log1);
        Logarithm log3 = new Logarithm();
        System.out.println(log1.base +"  "+log1.argument+"  "+log1.myfun());
        System.out.println(log2.base +"  "+log2.argument+"  "+log2. myfun());
        System.out.println(log3.base +"  "+log3.argument+"  "+log3. myfun());
    }
}
