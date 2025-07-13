package stream;

import java.util.HashMap;
import java.util.Map;

public class StreamOnMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);

        map.entrySet().stream()
                .filter(x -> x.getValue()%2==0)
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}
