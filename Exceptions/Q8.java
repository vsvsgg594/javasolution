package Exceptions;

public class Q8 {
    public static void main(String[] args) {
        int n=10;
        try{
            System.out.println(n/0);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
}