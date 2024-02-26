package threads.methods;

public class isAlive {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            // Yangi threadning ishlashi
            for (int i = 0; i < 5; i++) {
                System.out.println("Yangi thread ishlayapti...");
                try {
                    Thread.sleep(1000); // 1 sekund o'z ichida to'xtash
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread newThread = new Thread(myRunnable);

        System.out.println("Thread isAlive: " + newThread.isAlive()); // false, hali ishlayotgan emas

        newThread.start(); // Threadni ishga tushirish

        try {
            newThread.join(); // Asosiy thread bu threadni kutib turishi uchun
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread isAlive: " + newThread.isAlive()); // false, ishlayotgan thread to'xtagan
    }
}
