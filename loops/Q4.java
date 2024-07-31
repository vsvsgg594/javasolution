// Write a program to print the odd and even numbers
import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("Odd number ");
        }
    }
}