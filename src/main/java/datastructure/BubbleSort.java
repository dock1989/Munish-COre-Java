package datastructure;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = new int[]{5,3,2,6,8,4,9,1};
        for(int i=1;i<a.length;i++){ // this is for pass
            for(int j=0;j<(a.length-1);j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}
