package datastructure;

public class SwappingNumber {
    public static void main(String[] args) {
        int a=10,b=15,temp;  // expecting result is a=15 and b=10;
        temp = a;
        a= b;
        b= temp;
        System.out.println("a  = " +a);
        System.out.println("b  = " +b);
    }
}
