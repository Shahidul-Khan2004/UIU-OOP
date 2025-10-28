package ThreadPractice.Final243;

class Positive extends Thread {
    double sum = 1;
    public void run() {
        for (int i = 2, j = 3; i <= 50; i += 2, j += 2) {
            sum += Math.pow(1.15, i) / j;
        }
    }
}
class Negative extends Thread {
    double sum = 0;
    public void run() {
        for (int i = 1, j = 2; i <= 49; i += 2, j += 2) {
            sum += Math.pow(1.15, i) / j;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Positive p = new Positive();
        Negative n = new Negative();
        p.start();
        n.start();
        try {
            p.join();
            n.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double result = p.sum - n.sum;
        System.out.println(result);
    }
}
