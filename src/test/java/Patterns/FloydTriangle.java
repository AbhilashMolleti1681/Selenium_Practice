package Patterns;

/**
 * Created by amolleti on 4/12/2018.
 */
public class FloydTriangle {
    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
//            k++;
            System.out.println();
        }
    }
}
