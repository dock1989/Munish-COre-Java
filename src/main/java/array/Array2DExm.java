package array;

import java.util.Arrays;

public class Array2DExm {
    public static void main(String[] args) {
        int [][] arr = new int[][]{{-7,-2,5,-4},{2,-6,3},{3,-9,5}};
        for (int i=0;i< arr.length ; i++){ // row number
            for (int j=0;j<arr[i].length;j++){ // column data
               if(arr[i][j]<0)
                   arr[i][j] *=-1;
            }
            Arrays.sort(arr[i]);
            System.out.print(arr[i][0]);
        }
    }
}
