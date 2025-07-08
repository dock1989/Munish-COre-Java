package dattypes;

import java.util.Scanner;

public class AsciiExm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char a = scanner.next().charAt(0);
        int b = (int)a;
        System.out.println("The ascii value is " + b);
    }
}
