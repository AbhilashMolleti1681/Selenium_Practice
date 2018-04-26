package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by amolleti on 4/10/2018.
 */

//Find Duplicates with hashmaps
public class FindDup {
    public static void main(String[] args) {
        Map<Character, Integer> pam = new HashMap<Character, Integer>();
        String str = "afasd";

        char[] c = str.toCharArray();

        for (char value : c) {
            if (Character.isAlphabetic(value)) {
                if (pam.containsKey(value)) {
                    pam.put(value, pam.get(value) + 1);
                } else {
                    pam.put(value, 1);
                }
            }
        }
        System.out.println(pam);
        for (Map.Entry<Character, Integer> m : pam.entrySet()) {
            System.out.println("Key :-" + m.getKey() + " & " + " Value :-" + m.getValue());
        }

        Iterator<Map.Entry<Character, Integer>> m1 = pam.entrySet().iterator();

        while (m1.hasNext()) {
            Map.Entry<Character, Integer> temp = m1.next();
            System.out.println("Key :- " + temp.getKey() + " & " + "Value :- " + temp.getValue());

        }


    }
}
