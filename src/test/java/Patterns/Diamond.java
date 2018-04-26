package Patterns;
/**
 * Created by amolleti on 4/2/2018.
 */
public class Diamond {

    public static void main(String[] args) {
        int number = 5;
        int count = number - 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= count; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
            count--;
        }

    }
}

