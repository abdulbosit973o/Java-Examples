package threads;

public class MyRunnable implements Runnable {
    public void run() {
        // Yangi threadning ishlashi
        System.out.println("Yangi thread ishga tushdi!");
    }

    public static void main(String[] args) {
        Thread newThread = new Thread(new MyRunnable());
        newThread.start(); // Threadni ishga tushirish
    }
}