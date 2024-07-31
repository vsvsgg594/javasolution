package Exceptions;

public class Q3 {
    public void displayNumber(){
        int n=10;
        System.out.println(n/0);
    }
    public static void main(String[] args) {
        Q3 q=new Q3();
        q.displayNumber();
    }
}
