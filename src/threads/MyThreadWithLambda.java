package threads;

public class MyThreadWithLambda {
    public static void main(String[] args) {
        Thread newThread = new Thread(() -> {
            // Yangi threadning ishlashi
            System.out.println("Yangi thread ishga tushdi!");
        });

        newThread.start(); // Threadni ishga tushirish
    }
}