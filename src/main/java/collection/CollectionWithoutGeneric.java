package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionWithoutGeneric {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(20);
        list.add(20);
        int sum =0;
        for (int a : list){
            sum +=a;
        }

        System.out.println(sum);
        // set example

//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(7);
//        set.add(9);
//        set.add(20);
//        set.add(20);
//        int sum =0;
//        for (int a : set){
//            sum +=a;
//        }
//        System.out.println(sum);

    }
}
