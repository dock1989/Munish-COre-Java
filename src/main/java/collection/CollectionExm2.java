package collection;

import java.util.*;

public class CollectionExm2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");  //String
        list.add("2.5");  //Double
        list.add("c");   //Character
        list.add("A"); // Duplicate element
        System.out.println("List elements: " + list);

        Set <String> set = new HashSet<>();
        set.add("X");
        set.add("Y");
        set.add("Z");
        set.add("X"); // Duplicate element
        System.out.println("Set elements: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getValue());
        }
        map.put(2, "Twenty"); // Update value for key 2
        System.out.println("Map elements: " + map);

        // Queue example

        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue elements: " + queue);

        // Dequeue element
        String removedElement = queue.poll();
        System.out.println("Removed element from queue: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Stack example



    }
}
