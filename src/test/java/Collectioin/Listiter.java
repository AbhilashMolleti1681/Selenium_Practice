package Collectioin;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by amolleti on 4/7/2018.
 */
public class Listiter {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("Abhilasj");
        l.add("nani");
        l.add("molleti");
        l.add("ravi");
        l.add("son");
        Collections.sort(l);
        Collections.reverse(l);
        ListIterator<String> list = l.listIterator();
        while (list.hasNext()) {
            System.out.println("Names --> " + list.next());
        }

        System.out.println("===============================");

//        ListIterator<String> list1 = l.listIterator();
        while (list.hasPrevious()) {
            System.out.println("Names --> " + list.previous());
        }
    }


}
