package Exceptions;

public class Q4 {
    public static void main(String[] args) {
        int n=10;
        try{
            System.out.println(n/0);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
