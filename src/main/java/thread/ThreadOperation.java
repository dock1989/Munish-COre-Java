package thread;

public class ThreadOperation {
    // Thread class is used to create and manage threads in Java
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start(); // start() method is used to start the thread and calls the run() method

        MyThread2 r1 = new MyThread2();
        Thread t2 = new Thread(r1);
        t1.join();
        t2.start(); // start() method is used to start the thread and calls the run() method
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class MyThread2 implements Runnable {
    public void run() {
        for(int i = 10; i <= 15; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
