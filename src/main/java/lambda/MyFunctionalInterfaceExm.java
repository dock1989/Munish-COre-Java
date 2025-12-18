package lambda;

public class MyFunctionalInterfaceExm {
    public static void main(String[] args) {
        MyFunctionalInterface f= (a,b) -> {
            System.out.println("Sum is: "+(a+b));
        };
        f.sum(20, 20);
    }
}
