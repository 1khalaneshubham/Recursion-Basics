import java.util.*;


public class print10inRevers {

    public static void printDec(int n){
       
        if(n == 1){  // Base case
            System.out.println(n);
            return;
        }
        System.out.print(n+" "); 
        printDec(n-1); // n * f(n-1)

        // kam aahe ki dec-order madhe 10 print karn
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}