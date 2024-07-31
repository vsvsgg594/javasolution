// . Write a program to find the common values between two arrays
package Arrays;
import java.util.*;
public class Q12{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,45,5,5,6};
        int arr2[]={2,23,4,24,5,34};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}