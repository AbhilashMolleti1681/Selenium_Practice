package Patterns;

/**
 * Created by amolleti on 4/12/2018.
 */
public class OneStar {
    public static void main(String[] args) {
        // write your code here


        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
