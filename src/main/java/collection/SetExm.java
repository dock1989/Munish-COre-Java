package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExm {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);  // 1,present
        set.add(2);
        set.add(35);
        set.add(40);
        set.add(93);
        set.add(93);
        set.add(34);
        set.add(1); //1 ,present
        System.out.println(set);
        set.stream().filter(x -> x%2!=0).forEach(x -> System.out.println(x));
        System.out.println("Result is " + set.stream().mapToInt(x -> x).sum());

    }
}
