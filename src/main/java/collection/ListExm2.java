package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExm2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        int sum =0;
        for(int a: list){
            sum +=a;
        }


        System.out.println(sum);


    }
}
