package datastructure;

import java.util.Arrays;

public class SelectionSortExm2 {
    public static void main(String[] args) {
        int a[] = new int[]{7,2,4,5,6,8,2,3,4,6,2,4,6,1};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::println);

    }
}
