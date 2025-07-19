package thread;

public class ThreadExm2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo);
        Thread thread1 = new Thread(threadDemo2);
        thread.start();
        thread.join();
        thread1.start();
    }
}

class ThreadDemo extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        for(int i=11;i<=20;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
