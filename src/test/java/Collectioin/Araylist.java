package Collectioin;

import java.util.ArrayList;

/**
 * Created by amolleti on 4/5/2018.
 */
public class Araylist {

    static ArrayList<String> listnames = new ArrayList<String>();

    public static void removeByPosition(int position) {
        listnames.remove(position);
    }

    public static void removeByString(String position) {
        listnames.remove(position);
    }

    public static void addtolist(String names) {
        listnames.add(names);
    }

    public static void TotalListNames(ArrayList<String> listnames) {
        for (String s : listnames) {
//            if (s == "Jaaghu") continue;
            System.out.println(s);
        }
    }

    public static void modifyNewName(int position, String name) {
        listnames.add(position, name);
    }

    public static void modifyNewName1(int position, String name) {
        listnames.set(position, name);
    }

    public static int search(String name) {
        return listnames.indexOf(name);
    }

    public static void main(String[] args) {
        addtolist("Abhilash");
        addtolist("Mohan");
        addtolist("Jaaghu");
        addtolist("sateesh");
        addtolist("ramu");
        addtolist("radha");
        System.out.println(listnames);
        TotalListNames(listnames);
        removeByPosition(0);
        System.out.println("======****======");
        TotalListNames(listnames);
        System.out.println("======****======");
        modifyNewName(2, "Nima");
        TotalListNames(listnames);
        System.out.println("======****======");
        modifyNewName1(2, "Molleti Abhilash");
        TotalListNames(listnames);
        System.out.println("======****======");
        int position = search("Molleti Abhilash");
        System.out.println(position);
        int p = listnames.size();
        System.out.println(p);
    }
}
