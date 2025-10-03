package CT3_Practice;

interface MathConstants {
    static final double PI = 3.14;
}

class Circle implements MathConstants {
    public static void main(String[] args) {
        System.out.println("area of circle is: " + (PI * 5 * 5));
    }
}
