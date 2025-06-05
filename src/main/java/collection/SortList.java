package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,4,5,3,2,3,5,6,7,9,3);
        numList.stream()
                .sorted(Comparator.comparing(x -> x %2 !=0 ))
                .forEach(System.out::println);

        List<Integer> num2 = Arrays.asList(1,2,2,2,3,3,3,4,4,4,5,5,5);
        num2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((x,y) ->{
                    System.out.println(x + "-----" +y);
                });

        List<String> stringList = Arrays.asList("a","a","a","c","b","b");
        stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((x,y) ->{
                    System.out.println(x + "-----" +y);
                });
    }
}
