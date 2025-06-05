package exception;

import java.util.Scanner;

public class NumberExceptionExm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        try {
           System.out.println("Enter first number");
            a = scanner.nextInt();
            System.out.println("Enter second number");
            b = scanner.nextInt();
            c = a / b;
            System.out.println(c);
            throw new CustomExcpetionExm("This is a user defined exception");
        }
        catch (CustomExcpetionExm ce){
            System.out.println(ce.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("input number is not correct");
        }
        catch (Exception e){
            System.out.println("Some exception occurred");
        }

        finally {
            System.out.println("This block will always execute");
        }

    }
}
