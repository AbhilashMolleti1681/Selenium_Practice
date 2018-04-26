/**
 * Created by amolleti on 3/12/2018.
 */
public class Dtring {

    public static void main(String[] args) {
        Dtring d = new Dtring();
        System.out.println(d.count_Vowels("Abhilash"));
    }

    public int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
