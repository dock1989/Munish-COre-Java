package stream;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numList.stream().filter(x -> x%2 ==0 ).forEach(x -> System.out.println("The even numbers are " + x));
    }
}
