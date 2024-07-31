// Write a method for increment and decrement operators(++, --)
package operatror;

public class Q2 {
    public static void incrementAndDecreament(int n){
        int pre=++n;
        int post=n++;
        int pred=--n;
        int postd=n--;
        System.out.println("pre-increament"+pre);
        System.out.println("post-increamnet"+post);
        System.out.println("pre-decreamnet"+pred);
        System.out.println("post decreament"+postd);
    }
    public static void main(String[] args) {
        incrementAndDecreament(10);
    }
    
}
