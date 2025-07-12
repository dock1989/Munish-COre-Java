package conditional;

import util.ScannerUtil;

import java.util.Scanner;

public class MonthNameSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opt;
        do {
            System.out.println("Enter any Number between 1-12");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("Septmber");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Wrong Input");
            }
            System.out.println("Do you want to process more say Y/N");
            opt = scanner.next().charAt(0);
        }
        while (opt == 'Y' || opt == 'y');
    }
}
