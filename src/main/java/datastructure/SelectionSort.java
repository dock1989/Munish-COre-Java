package datastructure;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = new int[]{3,4,5,3,2,3,7,8,9,1,3,5};
        for(int i=0;i<a.length-1;i++){
            for(int j=(i+1);j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}
