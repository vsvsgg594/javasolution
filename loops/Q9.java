public class Q9 {
    public static void main(String[] args) {
        int n=10;
        // . Write a program to find the prime or not.
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}
