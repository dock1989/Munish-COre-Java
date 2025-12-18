package lambda;

public class ThreadUsingFunctionalInterface {
    public static void main(String[] args) {
       Runnable r= () -> {
           for(int i=1;i<=5;i++){
               System.out.println("Child Thread");
           }
       };
       Thread t=new Thread(r);
       t.start();
    }
}
