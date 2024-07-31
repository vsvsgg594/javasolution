// write a function to get the difference of largest and smallest value
package Arrays;
import java.util.*;
public class Q16 {
    public static int diffrenceBetweenLargestAndSmallest(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        return max-min;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int ans=diffrenceBetweenLargestAndSmallest(arr);
        System.out.println(ans);

    }
    
}
