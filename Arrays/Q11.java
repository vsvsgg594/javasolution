// . Write a function to find the duplicate values of an array

package Arrays;
import java.util.*;

public class Q11 {
    public static void findDuplicateRElement(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,3,4,2};
        findDuplicateRElement(arr);
        
    }
}
