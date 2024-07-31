// Write a class with a default constructor, one argument constructor and two argument 
// constructors. Instantiate the class to call all the constructors of that class from a main 
// class
package constroctor;
class Q1 {
    Q1(){
        System.out.println("this is default constructor");
    }
    Q1(int a){
        System.out.println("this is one argument constructor"+a);
    }
    Q1(int b,int c ){
        System.out.println("this is two argument constructors"+b+" "+c);
    }
}
public class A{
    public static void main(String[] args) {
        Q1 q1=new Q1();
        Q1 q2=new Q1(1);
        Q1 q3=new Q1(2,3);

    }

}
