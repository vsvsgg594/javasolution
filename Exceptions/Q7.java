package Exceptions;

public class Q7 {
    public static void main(String[] args) {
        int n=10;
        try{
            System.out.println(n/10);
        }catch(ArithmeticException ae ){
            System.out.println(ae);
        }finally{
            System.out.println("this is final block of code");
        }
    }
    
}
