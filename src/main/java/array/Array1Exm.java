package array;

import util.ScannerUtil;

public class Array1Exm {
    public static void main(String[] args) {
        int a[]=new int[11];   //---1 d
        int b[][]=new int[3][3]; // 1[] ---> row   2[]----> column
        int sum =0;
//        for (int i=0;i<=10;i++){
//            System.out.println("Enter any number");
//            a[i] = ScannerUtil.takeInput().nextInt();
//            sum+=a[i];  // sum = sum + a[i];
//        }
//        System.out.println(sum);


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = ScannerUtil.takeInput().nextInt();
              sum+=b[i][j];
            }
        }
        System.out.println(sum);




    }
}
