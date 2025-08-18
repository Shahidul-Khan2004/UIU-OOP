package CT1_Practice.Spring25;

public class Box {
    double width;
    double height;
    double depth;
    public void print(){
        System.out.println(width);
        System.out.println(height);
        System.out.println(depth);
    }

    public static void main(String[]
                                    args) {
        Box b1= new Box();
        b1.width=1;
        b1.height=2;
        b1.depth=3;
        Box b2 = b1;
        b1=null;
        b2.print();
    }
}
