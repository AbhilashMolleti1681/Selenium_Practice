package Collectioin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by amolleti on 4/5/2018.
 */
public class Aray {
    static int i;

    public static void main(String[] args) {
//        int inVariable[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 45};
//        for (i = 0; i < inVariable.length; i++) {
//            System.out.println(inVariable[i]);
//        }
//        System.out.println("====================");
//        String[] inString = {"Abhilash", "Rajesh", "Radha", "kumar", "Varun"};
//        for (i = 0; i <= inString.length - 1; i++)
//            System.out.println(inString[i]);
//        System.out.println("********************");
//        for (String s : inString) {
//            System.out.println(s);
//        }
//        System.out.println(inString.length);
        Map<Character, Integer> listMap = new HashMap<Character, Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String name = in.nextLine().toString();
        int value = 0;
        for (int i = 0; i < name.length(); i++) {

            if (i == 0) {
                listMap.put(name.charAt(0), 1);
            } else if (listMap.containsKey(name.charAt(i))) {
                value = listMap.get(name.charAt(i));
                listMap.put(name.charAt(i), value + 1);

            } else listMap.put(name.charAt(i), 1);


        }

        System.out.println(listMap);
    }
}
