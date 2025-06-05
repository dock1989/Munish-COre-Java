package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class SemaphoreExm {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);



        new IncThread("A",semaphore);
        new DecThread("B",semaphore);

    }
}

class SharedResource{
    static int count =0 ;
}

class IncThread implements Runnable{
    String name;
    Semaphore semaphore;

    public IncThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for(int i=1;i<10;i++){
                SharedResource.count++;
                System.out.println("The value after IncThread " + SharedResource.count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
    }
}


class DecThread implements Runnable{
    String name;
    Semaphore semaphore;

    public DecThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for(int i=1;i<10;i++){
                SharedResource.count--;
                System.out.println("The value after DecThread " + SharedResource.count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
    }
}
