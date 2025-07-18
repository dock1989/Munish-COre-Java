package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExm2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(6);
        set.add(6);
        set.add(3);
        set.add(9);

        int sum =0;
        for(int a: set){
            sum +=a;
        }

        System.out.println(sum);
    }
}
