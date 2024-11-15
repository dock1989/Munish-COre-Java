package inputloopingcondition;

import util.ScannerUtil;

public class ConditionalStatements {
    public static void main(String[] args) {
        IfExm ifExm = new IfExm();
        if(ifExm.checkEvenOdd())
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

        SwitchExm switchExm = new SwitchExm();
        System.out.println(switchExm.getWeekDay());
    }


}

class IfExm{
    public boolean checkEvenOdd() {
        int a;
        System.out.println("Enter any  number");
        a = ScannerUtil.takeInput().nextInt();
        if(a % 2 == 0)
            return true;
        return false;
    }
}

class SwitchExm{
    public String getWeekDay(){
        System.out.println("Enter any number between 1-7 ");
        int a = ScannerUtil.takeInput().nextInt();
     switch (a){
         case 1:
             return "Sunday";
         case 2:
             return "Monday";
         case 3:
             return "Tuesday";
         case 4:
             return "Wednesday";
         case 5:
             return "Thursday";
         case 6:
             return "Friday";
         case 7:
             return "Saturday";
         default:
             return "Invalid Input";
     }
    }
}