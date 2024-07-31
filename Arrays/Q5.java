// write a function to test if array contains a specific value
package Arrays;

public class Q5 {
    public static boolean checkedSpecfic(int x,int arr[]){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
               flag=true;
            }else{
                flag=false;
            }
        }
        return flag;
      
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        boolean ans=checkedSpecfic(6, arr);
        if(ans){
            System.out.println("yes number is there");
        }else{
            System.out.println("not number is not there");
        }
        
    }
    
}
