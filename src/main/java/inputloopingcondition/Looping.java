package inputloopingcondition;

import util.ScannerUtil;

public class Looping {
    public static void main(String[] args) {
        Looping looping = new Looping();
        System.out.println("Enter a number");
        int a = ScannerUtil.takeInput().nextInt();
        looping.forLoopExm(a);
        looping.whileLoopExm(a);
        looping.dowhileLoopExm(a);
    }

    public void forLoopExm(int a){
        System.out.println("From for loop");
        for (int i=0;i<=10;i++){
            System.out.println(i*a);
        }

    }

    public void whileLoopExm(int a){
        System.out.println("From while loop");
        int i=0;
        while (i<=10){
            System.out.println(i*a);
            i++;
        }

    }

    public void dowhileLoopExm(int a){
        System.out.println("From do-while loop");
        int i=0;
        do{
            System.out.println(i*a);
            i++;
        }
        while (i<=10);

    }

}
