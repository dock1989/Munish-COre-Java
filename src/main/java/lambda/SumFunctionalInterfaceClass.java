package lambda;

public class SumFunctionalInterfaceClass {
    public static void main(String[] args) {
        SumFunctionalInterface sumFunctionalInterface = () -> {return "Good Morning";};
        System.out.println(sumFunctionalInterface.sum());
    }
}
