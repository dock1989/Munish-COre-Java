package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExm2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");
        map.put("5","five");

        for(Map.Entry<String,String> a: map.entrySet()){
            System.out.println(a.getValue());
        }


//        System.out.println(map);
    }
}
