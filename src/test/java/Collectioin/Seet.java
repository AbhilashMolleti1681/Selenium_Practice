package Collectioin;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amolleti on 4/9/2018.
 */
public class Seet {
    static Set<String> s = new HashSet<String>();

    // Sets doesn't allow duplicates and it doesn't have .get method like lists concepts, it have contains method it return true/false

    public static void main(String[] args) {
        s.add("Chand");
        s.add("Zaa");
        s.add("Abhilash");
        s.add("molleti");
        s.add("Moll");
        s.add("nani");
        s.add("chandu");
        s.add("nani");
        printList(s);
    }

    public static void printList(Set<String> name) {
        for (String ss : s) {
            System.out.println(ss);
        }
    }
}
