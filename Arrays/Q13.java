// . Write a method to remove duplicate elements from an array
package Arrays;
import java.util.*;
public class Q13 {
        public static void removeDuplicate(int arr[]){
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
            }
           System.out.println(set);
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,4,5,6};
            removeDuplicate(arr);
        
    }
    
}
