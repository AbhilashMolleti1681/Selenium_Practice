package Collectioin;

import java.util.LinkedList;

/**
 * Created by amolleti on 4/7/2018.
 */
public class Linkdlist {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("Abhilash");
        l.add("Molleti");
        l.add("radha");
        l.add("dasari");
        l.add("harsha");
        l.add("sai");
        l.add("tangudu");
        l.remove("radha");
        l.remove();
        l.remove(5);
        System.out.println(l);

        for (int i = 0; i <= l.size()-1; i++) {
            System.out.println(l.get(i));
        }

    }
}
