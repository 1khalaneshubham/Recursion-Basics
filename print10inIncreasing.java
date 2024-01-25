import java.util.*;

public class print10inIncreasing {

   public static void printInc(int n){

        if( n == 100 ){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printInc(n+1);

    }
    public static void main(String[] args) {
        int n = 1;
        printInc(n);
    }
}
