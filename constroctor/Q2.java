package constroctor;

class Q2 {
    Q2(){
        System.out.println("this is default constructor");
    }
    Q2(int a){
        System.out.println("this is one argument constructor"+a);
    }
    Q2(int b,int c ){
        System.out.println("this is two argument constructors"+b+" "+c);
    }
}
public class A{
    public static void main(String[] args) {
        Q2 q1=new Q2();
        Q2 q2=new Q2(1);
        Q2 q3=new Q2(2,3);

    }

    
}
