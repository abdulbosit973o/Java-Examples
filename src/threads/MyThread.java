package threads;

public class MyThread extends Thread {
    public void run() {
        // Yangi threadning ishlashi
        System.out.println("Yangi thread ishga tushdi!");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Threadni ishga tushirish
    }
}