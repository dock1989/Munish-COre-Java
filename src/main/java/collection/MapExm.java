package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExm {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",6);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        map.put("B",9);
        System.out.println(map.entrySet());
        int sum =0;
//        for (Map.Entry<String,Integer> map1:map.entrySet()){
//            System.out.println(map1.getKey());
////            sum+=map1.getValue();
//        }
////        System.out.println(sum);

//        System.out.println("Result is "+
//                map.entrySet().stream().mapToInt(x -> x.getValue()).sum());
    }
}


/**
 * map --- cleection of key - value
 * set --- internally works as map --- key is the value you are giving,
 * and value is "Present" by default
 */