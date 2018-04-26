package Patterns;

/**
 * Created by amolleti on 4/12/2018.
 */
public class TwoStar2 {
    public static void main(String[] args){
        int number =5;
        for(int row=1;row<=number;row++){
            for(int col=1;col<=number-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
