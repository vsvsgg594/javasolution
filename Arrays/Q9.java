// Write a function to find the minimum and maximum value of an array
package Arrays;
import java.util.Scanner;
public class Q9 {
    public static void maximumAndminium(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximun number is "+ max +"and"+"minium number " +min);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        maximumAndminium(arr);
        
    }
}
