class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class MultiThreadRunnableExample {
    public static void main(String[] args) {
        int numThreads = 5;

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}

