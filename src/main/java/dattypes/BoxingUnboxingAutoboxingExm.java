package dattypes;

public class BoxingUnboxingAutoboxingExm {
    public static void main(String[] args) {
      int sum=10;
      String b = Integer.toString(sum); // converted from primitive to non-primitive -- Boxing
        System.out.println(b);
       int c = Integer.parseInt(b); // converted from non-primitive to primitive -- unBoxing
        System.out.println("The value from c is " +  c);

        Integer k=25;
        int p = k;
        Integer s= p;


    }
}
