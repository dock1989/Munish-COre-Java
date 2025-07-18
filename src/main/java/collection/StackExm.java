package collection;

import java.util.Stack;

public class StackExm {
    public static void main(String[] args) {
        Stack<String> fruit = new Stack<>();
        fruit.push("Apple");
        fruit.push("Bananna");
        fruit.push("Mango");
        fruit.push("Kiwi");
        fruit.push("Orange");

//        String topFruit = fruit.peek();
//        System.out.println("Top Most fruit is " + topFruit);
        while(!fruit.isEmpty()){
            System.out.println(fruit.pop());
        }
        System.out.println("All fruits have been taken out");
    }
}
