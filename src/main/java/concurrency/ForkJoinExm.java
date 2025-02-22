package concurrency;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinExm {
    public static void main(String[] args) {
        int f[] = new int[10000];
        for(int i=0;i<f.length;i++){
            f[i]=(i+1);
        }
        System.out.println("Before task completion");
        Arrays.stream(f).forEach(System.out::print);
        SquareNum task = new SquareNum(f,0,f.length);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(task);
        System.out.println("\nAfter completion task");
        Arrays.stream(f).forEach(System.out::print);
    }
}

class SquareNum extends RecursiveAction{

    int [] data;
    int start,end;
    int threshold = 1000;

    public SquareNum(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if(start - end < threshold){
            for(int i = start;i<end;i++){
                data[i] = data[i] * data[i];
            }
        }
        else {
            int middle = (start + end) / 2 ;
            invokeAll(new SquareNum(data,start,middle),
                    new SquareNum(data,middle,end));
        }
    }
}
