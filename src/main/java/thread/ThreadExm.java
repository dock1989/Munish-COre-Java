package thread;

public class ThreadExm {
    public static void main(String[] args) throws InterruptedException {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.testLambdaWithThread();

    }
}

    class ThreadOne {

        public void testLambdaWithThread() {
            Runnable runnable = () -> {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
                ;
            };



        }
    }

    class ThreadTwo extends Thread {
        @Override
        public void run() {
            for (int i = 11; i <= 20; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }

