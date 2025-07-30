package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExm {
    public static void main(String[] args) {
        List list = new LinkedList<>();
        list.add(2,5);
        list.add(1,7);
        list.add(4,8);
        list.add(5,9);
        list.add(3,0);
        System.out.println(list);
    }
}
