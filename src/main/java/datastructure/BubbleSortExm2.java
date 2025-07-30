package datastructure;

import java.util.Arrays;

/**
 * 1. create the list with some random numbers
 * 2. then apply bubble sort for sorting
 */
public class BubbleSortExm2 {
    public static void main(String[] args) {
        int a[] = new int[]{2,3,4,5,6,7,8,9,0,2,3,4,3,5,6,7,8,9};
        System.out.println("Number of elements in array:" + a.length);

        for(int i=1;i<a.length;i++){ // it will tell me the number of passes
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}


/**
 * pass: number of steps
 * j : number of elements
 */