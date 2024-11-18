package array;

import util.ScannerUtil;

public class Array1Exm {
    public static void main(String[] args) {
        int a[]=new int[10];   //---1 d
        int b[][]=new int[3][3]; // 1[] ---> row   2[]----> column
        int sum =0;
        for (int i=0;i<10;i++){
            System.out.println("Enter any number");
            a[i] = ScannerUtil.takeInput().nextInt();
            sum+=a[i];
        }
        System.out.println(sum);

    }
}
