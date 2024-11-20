package inheritance;

public class SumUsingFunctionalInterface {
    public static void main(String[] args) {
        FunctionalInterfaceExm functionalInterfaceExm = (x,y) ->
        {
            return x + y;
        };


        System.out.println(functionalInterfaceExm.sum(3,4));
        functionalInterfaceExm.dd();


    }
}
