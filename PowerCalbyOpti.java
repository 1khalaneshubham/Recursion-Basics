import java.util.*;

public class PowerCalbyOpti {

    public static int OptPower(int a,int n){

        // TC -> O(n)
        if(n == 0){
            return 1;
        }
        int halfPower = OptPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        // n is Odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        } 

        return halfPowerSq;
    }
    public static void main(String[] args) {
        
        int a = 2; 
        int n = 10;

        System.err.println(OptPower(a, n));
    }
}
