package CT1_Practice;

public class Alpha {
    static  int x = 2;
    int y;
    int z;
    {
        y = x+1;
        System.out.println("Instance block. y = "+ y);
    }
    static {
        System.out.println("First Static Block. x = "+ x);
        x += 3;
    }
    {
        y = ++x;
        x = x+2;
        System.out.println("Instance block. y = "+ y);
    }

    Alpha(){
        System.out.println("Default Constructor. x = "+ x + ",y = "+ y);
    }
    Alpha(int y){
        this();
        x += y;
        this.y += y;
        System.out.println("Overloaded Constructor. x = "+ x + ",y = "+ y);
    }
    Alpha(int y, int z){
        y = y;
        z = z;
    }
    public static void main(String[] args) {
        Alpha a2 = new Alpha(5);
        Alpha a3 = new Alpha(5,2);
        System.out.println("Value of y and z of a3: "+ a3.y + ", " + a3.z);
        System.out.println("Final x = "+ Alpha.x);
    }
}
