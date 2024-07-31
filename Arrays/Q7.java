// . Write a function to copy an array to another array
package Arrays;

public class Q7 {
    public static void copyArray(int arr[]){
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }

    
    }
    public static void main(String[] args) {
        
     int arr[]={1,2,3,4,5,6,7,8};
     System.out.println("original arrays ");
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
     }
     copyArray(arr);
     System.out.println("copy arrays ");
     for(int i=arr.length-1;i>0;i--){
        System.out.print(arr[i] +   " ");
     }
    }
}
