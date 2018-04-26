package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by amolleti on 4/10/2018.
 */
public class KayandValues {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Abhilash");
        map.put(2, "Abhilash");
        map.put(3, "sateesh");
        map.put(4, "nani");
        Character c=new Character('A');
//
//        for (Map.Entry<Integer, String> map1:map.entrySet()){
//           System.out.println("Key :-" + map1.getKey() +" ----> "+  "Value :-" + map1.getValue() );
//        }
//        for (Integer key : map.keySet()) {
//            System.out.println(" Key :- " + key + " ----> " +" Value :- " + map.get(key));
//        }
//        System.out.println(map.get(4));
//        System.out.println(map);

        Iterator<Map.Entry<Integer, String>> entry = map.entrySet().iterator();
        while (entry.hasNext()) {
//            Map.Entry<Integer, String> temp = entry.next();
            System.out.println("KEY :-" + entry.next().getKey() + " Value :-" + entry.next().getValue());
//            System.out.println("Key :-" + temp.getKey() + "  value :-" + temp.getValue());
        }

    }
}
