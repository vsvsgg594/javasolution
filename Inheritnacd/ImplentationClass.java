package Inheritnacd;

class A  {
    public  void displayClassName(){
        System.out.println("this is parents class");
    }
    public  void displayPropertires(){
        System.out.println("this is show propertires");
    }
    public  void showClassName(){
        System.out.print("parents class show methods");
    }
}
class B extends A{
  int a=10;
  int b=12;
  public  void add(){
    System.out.println(a+b);

  }
  public  void sub(){
    System.out.println(a-b);
  }
   public void displayClassName(){
    System.out.println("this is class B");
   }

}
class  C extends  B {
   String name="vikash";
   String address="bihar";
   public void displayNames(){
    System.out.print("name is "+name);
   }
   public void displayAddress(){
    System.out.print("Address  is "+ address);
   }
   public void displayClassName(){
    System.out.println("this is class C");
   }

}
public class ImplentationClass{
    public static void main(String args[]){
      A aObjects=new A();
      B bObjects=new B();
      C cObjects=new C();
      aObjects.displayClassName();
      bObjects.displayClassName();
      


    }
}
