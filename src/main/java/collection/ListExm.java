package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExm {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(35);
        list.add(40);
        list.add(93);
        list.add(93);
        list.add(34);
        System.out.println(list);
//        list.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));

        int result = list.stream().mapToInt(x -> x).sum();
        System.out.println("The result is " + result);

    }
}
/**
 * interface, abstract class, functional , lambda, stream
 */