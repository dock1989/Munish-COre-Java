package inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIteration {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("Ajay");
        arrList.add("Ajay");
        arrList.add("Ajay");
        arrList.add("Ajay");
        arrList.add("Ajay");

        for(String a : arrList){
            System.out.println(a);
        }

        System.out.println("--------------------------");

        Iterator<String> it = arrList.iterator();
        it.forEachRemaining(mishi -> System.out.println(mishi));
    }
}
