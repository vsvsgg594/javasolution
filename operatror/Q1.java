// Write a function for arithmetic operators(+,-,*,/)
package operatror;
import java.util.*;

public class Q1 {
    public static void displayArithmetic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        System.out.println("enter the second number ");
        int m=sc.nextInt();
        int add=n+m;
        System.out.println("add"+add);
        if(n>m){
            int sub=n-m;
            System.out.println("sub"+sub);

        }else{
            int sub1=m-n;
            System.out.println("sub"+sub1);
        }
        int mul=n*m;
        System.out.println("multiple"+mul);
        int d=n/m;
        System.out.println("division"+d);
        
    }
    public static void main(String[] args) {
        displayArithmetic();
    }
}
