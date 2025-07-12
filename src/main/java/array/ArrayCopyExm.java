package array;

import java.lang.reflect.Array;

public class ArrayCopyExm {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5,6,7,8,9};
        int b[] = new int[]{11,12,13,14,15,16,17,18,19};
        System.arraycopy(a,4,b,3,2);

        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
