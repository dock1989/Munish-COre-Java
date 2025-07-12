package array;

import java.util.Scanner;

public class EvenOutOfTenNumber {
    public static void main(String[] args) {
        int a [] = new int[10];
        int count =0;
        Scanner scanner = new Scanner(System.in);
        char opt;
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter any number");
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < 10; i++) {
                if (a[i] % 2 == 0) {
                    System.out.println(a[i]);
                    count++;
                }
            }
            System.out.println("Total even numbers are " + count);
            System.out.println("Do you want to process more say Y/N");
            opt = scanner.next().charAt(0);
        }
        while (opt=='Y' || opt == 'y');

    }
}
