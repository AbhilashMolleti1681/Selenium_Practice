import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amolleti on 3/14/2018.
 */
public class ExampleAllPermutationOfString {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a String : ");

//        String str = sc.next();
        String str = "Abh";

        generate(str.toCharArray(), str.length());
    }

    public static void generate(char[] arr, int n) {
        if (n == 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 0; i < n; i++) {
                generate(arr, n - 1);

                // odd or even
                if (n % 2 == 1) {
                    swap(arr, 0, n - 1);
                } else {
                    swap(arr, i, n - 1);
                }
            }
            generate(arr, n - 1);
        }
    }

    private static void swap(char[] arr, int right, int left) {
        char temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
