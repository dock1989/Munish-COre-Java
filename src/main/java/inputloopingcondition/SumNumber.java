package inputloopingcondition;


import util.ScannerUtil;

/**
 * We have 2 ways to take the input:
 * 1. Using Scanner ----> java.util package --- normal java operations
 * 2. Using InputStreamReader ----> java.io package ---> for file and database
 */
public class SumNumber {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter first number");
        a = ScannerUtil.takeInput().nextInt();
        System.out.println("Enter second Number");
        b = ScannerUtil.takeInput().nextInt();
        System.out.println("The sum is " + (a+b));
    }
}


