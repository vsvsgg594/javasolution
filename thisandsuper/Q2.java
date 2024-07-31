package thisandsuper;

class A{
    int a=10;
}
class B extends A{
    public void display(){
        System.out.println(super.a);
    }
}
public class Q2 extends B{
    public static void main(String[] args) {
        B b =new B();
        b.display();
    }

}