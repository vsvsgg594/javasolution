package Arrays;

public class Q2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int len=arr.length;
        int avg=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        avg=sum/len;
        System.out.println("avg is "+avg);
     }
    
}
