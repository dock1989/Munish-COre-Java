package dattypes;

import java.util.Scanner;

public class DataTypeExm {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        a = scanner.nextDouble();
        System.out.println("Enter second number");
        b = scanner.nextDouble();
        c = a+b;
        System.out.println("The result is " + c);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(1);
        System.out.println(ch);

    }
}
