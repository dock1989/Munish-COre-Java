package thread;

public class ThreadUsingFuncationalInterface {
    public static void main(String[] args) {
    Runnable runnable =  ()->{
          for(int i=1;i<10;i++){
              System.out.println(i);
              try {
                  Thread.sleep(3000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          };
        };
    runnable.run();
    }
}
