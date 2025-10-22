package ThreadPractice.Parking;

public class Parking {
    static int Available = 2;
    static class Parkable implements Runnable {

        @Override
        synchronized public void run() {
            String car = Thread.currentThread().getName();//if Thread.currentThread() is called outside run it'll refer to main
            System.out.println(car + " trying to park");
            if (Available >= 1) {
                Available--;
                System.out.println(car + " parked successfully");
            }
            else {
                System.out.println(car + " parked unsuccessfully");
            }
        }
    }

    public static void main(String[] args) {
        Thread[] Cars = new Thread[5];
        for (int i = 0; i < 5; i++) {
            Cars[i] = new Thread(new Parkable());
            Cars[i].start();
            try{
                Cars[i].join();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
