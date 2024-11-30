package concurrency;

import java.util.concurrent.*;

public class CallabaleExm {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FirstCall firstCall = new FirstCall();
        SecondCall secondCall = new SecondCall();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(firstCall);
        Future<Integer> future1 = executorService.submit(secondCall);
        Integer a = future.get();
        System.out.println(a);
        Integer b = future1.get();
        System.out.println(b);
    }

}

class FirstCall implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("From Call Method");
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        return sum;

    }
}

class SecondCall implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("From Call Method");
        int sum = 0;
        for(int i=11;i<=20;i++){
            sum+=i;
        }
        return sum;

    }
}