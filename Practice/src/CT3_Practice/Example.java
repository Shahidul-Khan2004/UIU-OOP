package CT3_Practice;

public class Example {
    public static void main(String[] args) {
        try {
            int arr[] = new int[7];
            arr[10] = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getMessage());
        }
    }
}
