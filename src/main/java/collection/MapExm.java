package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExm {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        System.out.println(map.entrySet());
        int sum =0;
        for (Map.Entry<String,Integer> map1:map.entrySet()){
            System.out.println(map1.getKey());
//            sum+=map1.getValue();
        }
//        System.out.println(sum);
    }
}
