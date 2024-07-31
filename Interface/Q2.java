package Interface;
// Create an interface with two methods, but implement only one in a class. Call the 
// method implemented.

interface A{
    void showName();
    public static void showAge(){
        System.out.println("thsi is show methods in interface");
    }
}
public class Q2 implements A {

    @Override
    public void showName() {
        System.out.println("thhis is showName method in interface");
      
        throw new UnsupportedOperationException("Unimplemented method 'showName'");
    }
    public static void main(String[] args) {
        Q2 q=new Q2();
        q.showName();
    }
    
}
