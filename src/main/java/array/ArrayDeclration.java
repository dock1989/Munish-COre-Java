package array;

import java.util.Scanner;

/**
 * <b>Addition of 10 numbers passed in an Array</b>
 */

public class ArrayDeclration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        int sum = 0;
        System.out.println("a length " + a.length);

        int b[] = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(b.length);

        for(int i=0;i<10;i++){
            System.out.println("Enter a number");
            a[i] = scanner.nextInt();
            sum += a[i];
        }

        System.out.println(sum);

        for(int i=0;i<b.length;i++){
            if(b[i] % 2 == 0)
                System.out.println("The even number is " + b[i]);
            else
                System.out.println("The odd number is " + b[i]);
        }



    }
}
