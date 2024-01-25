import java.util.*;

public class printSUMofN {

    // TC -> O(n)
    // SC -> O(n)
    public static int calcSum(int n){
        
        if(n == 1){
            return 1;
        }

        // int Snm1 = calcSum(n-1);
        int Sn = n + calcSum(n-1);
        return Sn;

    }
    public static void main(String[] args) {
        
        int n = 5;
        calcSum(n);
        System.out.println(calcSum(n));

    }
}
