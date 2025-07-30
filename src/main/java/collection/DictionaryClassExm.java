package collection;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Vector;

public class DictionaryClassExm {
    public static void main(String[] args) {
        Dictionary<String,Integer> dictionary = new Hashtable<>();
        Vector<String> vector = new Vector<>();
        

        dictionary.put("A",1);
        dictionary.put("B",2);
        dictionary.put("C",6);
        dictionary.put("D",4);
        dictionary.put("E",5);
        dictionary.put("F",6);
        dictionary.put("B",9);

        System.out.println(dictionary.get("D"));
    }
}
