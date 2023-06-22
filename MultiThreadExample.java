class MyThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        int numThreads = 5;

        for (int i = 0; i < numThreads; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}

