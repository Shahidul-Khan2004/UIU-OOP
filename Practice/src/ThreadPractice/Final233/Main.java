package ThreadPractice.Final233;

import java.util.Arrays;

class Max extends Thread {
    int[] arr;
    int max;
    Max(int[] arr) {
        this.arr = arr;
    }
    public void run() {
        Arrays.sort(arr);
        max = arr[arr.length - 1];
    }
}

public class Main {
    public static void main(String[] args) {
        Max t1 = new Max(new int[]{3,1,-5,10});
        Max t2 = new Max(new int[]{-2,6,7,8,0});
        Max t3 = new Max(new int[]{12,-6,4,2,1});
        Max t4 = new Max(new int[]{10,5,-9,18,7});
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] maxNums = new int[] {t1.max, t2.max, t3.max, t4.max};
        Arrays.sort(maxNums);
        System.out.println(maxNums[3]);
    }
}
