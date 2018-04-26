package Collectioin;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by amolleti on 4/7/2018.
 */
public class Iteratos {
    static String myList = "nani";

    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("Abhilasj");
        l.add("nani");
        l.add("molleti");
        l.add("ravi");
        l.add("son");
        printList(l);
    }

    public static void printList(List<String> list) {
        Iterator<String> iter = list.iterator();
//        if (iter.equals("Abhilasj")) iter.remove();
        while (iter.hasNext()) {
            if (myList.equals(iter.next())) iter.remove();
//                       System.out.println("Elements ===" + iter.next());
        }
        System.out.println(list);

    }
}
