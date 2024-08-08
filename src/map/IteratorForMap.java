package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IteratorForMap {
    public static void main(String[] args) {
        Map<Integer,String > map = new TreeMap<>();
        map.put(124,"Olga");
        map.put(125,"Piter");
        map.put(128,"Olga");
        map.put(250,"Nelly");

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
