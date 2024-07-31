package Abstract;

abstract class Q2{

    abstract void display();

    abstract void showName();

    public void addName(){
    System.out.println("i am vikash");
    }
}
class A extends Q2{

    @Override
    void display() {
       System.out.println("this is abstract display method");
    }

    @Override
    void showName() {
       System.out.println("this is abstract show methods");
    }
    
}
public class Imp{
    public static void main(String[] args) {
        A a1=new A();
        a1.addName();
        a1.display();
        a1.showName();
        
    }
}
//aLL question in abstract//
