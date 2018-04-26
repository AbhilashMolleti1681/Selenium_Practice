package Patterns;

/**
 * Created by amolleti on 4/12/2018.
 */
public class TwoStar {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
