package Interface;
// Create a PUBLIC interface with fields and methods, fields should have values assigned. 
// Implement this interface to some class and print the values of the interface fields and 
// call the interface methods
public interface A{
    int a=10;
    public void show();
}
public class Q8 implements A {
    public void show(){
        System.out.println("this is show methods");
    }
    public static void main(String[] args) {
        Q8 q=new Q8();
        System.out.println(q.a);
       q.show();
    }
    
}
