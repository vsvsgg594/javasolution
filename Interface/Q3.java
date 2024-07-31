package Interface;
// Create two interfaces with one method each. Implement these two interfaces in one 
// class
interface A{
   void showA();
}
interface B{
   void showB();
}
class C implements A,B{

    @Override
    public void showB() {
       System.out.println("this is showA method in interface A");
    }

    @Override
    public void showA() {
       System.out.println("this is showB methjod in interface B");
    }
    
}
public class Q3 extends C {
    public static void main(String[] args) {
        C s=new C();
    }
    
}
