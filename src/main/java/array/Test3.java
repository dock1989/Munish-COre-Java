package array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",1);
        map.put("D",1);

//        List<Integer> list = Arrays.asList(1,2,2,2,2,2,4,4,4);

        map.entrySet().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((x,y)-> {System.out.print(x);
                    System.out.println(y);});
    }
}
