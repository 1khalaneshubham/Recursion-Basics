import java.util.*;

// Find first occurence of an element in an array
public class FirstOccurence {

    public static int FirstOcr(int arr[],int key, int i){
        if( i == arr.length ){
            return -1;
        }
        if( arr[i] == key ){
            return i;
        }
        return FirstOcr(arr, key, i+1);
    }
    public static void main(String[] args) {

        int  arr[] = { 8,3,6,9,5,10,2,5,3};
        System.out.println(FirstOcr(arr, 5, 0));
  
    }
}
