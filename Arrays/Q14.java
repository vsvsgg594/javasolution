package Arrays;
import java.util.*;
public class Q14 {
    public static int secondLargestNumber(int arr[]){
       Arrays.sort(arr);

       return arr[arr.length-2];


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,67};
        int ans=secondLargestNumber(arr);
        System.out.println(ans);
        
    }
    
}
