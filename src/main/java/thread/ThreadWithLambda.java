package thread;

public class ThreadWithLambda {


    public static void main(String[] args)  {
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

            runnable.run();



        }
    }

