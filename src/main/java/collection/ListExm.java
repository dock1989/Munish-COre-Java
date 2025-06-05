package collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((x,y) -> System.out.println(x + "    " + y));

    }
}
/**
 * interface, abstract class, functional , lambda, stream
 */