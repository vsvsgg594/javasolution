// Write a method to find number of even number and odd numbers in an array
package Arrays;
import java.util.*;
public class Q15 {
    public static void findEvenAndOdd(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even"+arr[i]);
            }else{
                System.out.println(arr[i]+"odd");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={34,43,23,12,54,89};
        findEvenAndOdd(arr);
        
    }
}
