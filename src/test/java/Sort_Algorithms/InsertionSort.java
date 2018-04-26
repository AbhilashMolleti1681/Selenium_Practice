package Sort_Algorithms;

/**
 * Created by amolleti on 4/23/2018.
 */
public class InsertionSort {

    public static void main(String args[]) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        Sortmethod(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static int Sortmethod(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }


        return 0;
    }
}