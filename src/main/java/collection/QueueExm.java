package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueExm {
    public static void main(String[] args) {
        Queue<String> fruit = new PriorityQueue<>();

        fruit.add("Apple");

        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Bananna");

//        String topFruit = fruit.peek();
//        System.out.println("Top Most fruit is " + topFruit);
        while(!fruit.isEmpty()){
            System.out.println(fruit.poll());
        }
        System.out.println("All fruits have been taken out");
    }
    }

