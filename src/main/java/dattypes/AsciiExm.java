package dattypes;

import java.util.Scanner;

/**
 * Write a program to accept a character and print the Ascii value
 * of the character
 */
public class AsciiExm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char a = scanner.next().charAt(1);
        int b = (int)a;
        System.out.printf("The ascii value is %d ",b);
    }
}
