package looping;


import util.ScannerUtil;

public class ForExm {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        int a = ScannerUtil.takeInput().nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(a*i);
        }

    }
}
