package thread;

public class ThreadBasic {
    public static void main(String[] args) throws InterruptedException {
        ThreadFirst threadFirst = new ThreadFirst();
        ThreadTwoOne threadTwoOne = new ThreadTwoOne();
        Thread t1,t2;
        t1 = new Thread(threadFirst);
        t2 = new Thread(threadTwoOne);
        t1.start();
        t1.join();
        t2.start();
    }
}

class ThreadFirst extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadTwoOne implements Runnable{
    @Override
    public void run() {
        for(int i=11;i<=20;i++){
            System.out.println(i);
        }
    }
}
