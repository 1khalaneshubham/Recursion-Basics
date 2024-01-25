import java.util.*;

//WAF to find the last Occurence of an element in an array
public class LastOccurence {
    
    public static int LastOcr(int arr[],int key, int i){
        
        if(i == arr.length){
            return -1;
        }

        int isFound = LastOcr(arr, key, i+1);
        
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
        
    }
    public static void main(String[] args) {

        int  arr[] = { 8,3,6,9,5,10,2,5,3};
        System.out.println(LastOcr(arr, 5, 0));
  
    }
        
}
