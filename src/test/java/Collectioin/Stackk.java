package Collectioin;

import java.util.Stack;

/**
 * Created by amolleti on 4/7/2018.
 */
public class Stackk {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(4);
        s.pop();
        System.out.println(s.empty());
        System.out.println(s);
        System.out.println(s.peek());

    }
}
