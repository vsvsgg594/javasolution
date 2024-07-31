// . Write a function to reverse an array of integer values
package Arrays;
public class Q10 {
    public static void reverse(int arr[]){
        int rev[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;

        }
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
      
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverse(arr);
       
    }
}
