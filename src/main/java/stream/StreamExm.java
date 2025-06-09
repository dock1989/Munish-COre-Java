package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExm {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,7,4,6,5,8,9,10);
        numList.stream().sorted().forEach(System.out::println);
//        numList.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
    }
}
