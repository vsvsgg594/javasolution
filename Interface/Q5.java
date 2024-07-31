package Interface;
// create two interfaces with the same method (same signature) in both the interfaces. 
// Implement these two interfaces in one class. Call the method.

interface A{
    void show();

}
interface B{
    void show();

}
public class Q5 implements A,B {

    @Override
    public void show() {
       System.out.println("show methods");
    }
    public static void main(String[] args) {
        Q5 q=new Q5();
        q.show();
    }
}
