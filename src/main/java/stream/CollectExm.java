package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class CollectExm {
    public static void main(String[] args) {
        List<String> charList = Arrays.asList("a","a","a","b","c","b","a","a","c");
        Map<String, Long> collect = charList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((x,y) -> {
            System.out.print(x + "_---------------------------------- " + y);
            System.out.println();
        });
    }
}
