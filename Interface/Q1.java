package Interface;
/**
 * InnerQ1
 */
interface InnerQ1 {
    void show();

    
}
public class Q1 implements InnerQ1{

    @Override
    public void show() {
        System.out.println("this is implementation class");
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
    public static void main(String[] args) {
    Q1 q=new Q1();
    q.show();
    }
    
}
