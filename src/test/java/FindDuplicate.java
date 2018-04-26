/**
 * Created by amolleti on 4/12/2018.
 */
public class FindDuplicate {
    static String Words = "ABHILSIII";

    public static void main(String[] args) {
        FindDuplicate f = new FindDuplicate();
        f.printDuplicate();
    }

    public static String printDuplicate() {
        for (int i = 0; i < Words.length(); i++) {
            for (int j = i + 1; j < Words.length(); j++) {
                if (Words.charAt(i) == Words.charAt(j)) {
//                    char c = Words.charAt(i);
//                    System.out.println(c);
                    System.out.print(Words.charAt(i) + " ");
                    break;
                }
            }
        }
        return "Abhilash";
    }

}
