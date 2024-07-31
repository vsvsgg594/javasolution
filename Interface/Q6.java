package Interface;
// Create an interface with a default method and implement it in a class. Do not provide 
// implementation to the default method and call the method.
interface A{
    default void name(){

    }
}
public class Q6 implements A{
    public static void main(String[] args) {
        Q6 q=new Q6();
        q.name();
    }
    
}
