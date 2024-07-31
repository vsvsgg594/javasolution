package thisandsuper;
class Parent {
  Parent() {
    System.out.println("Parent class default constructor");
  }
  Parent(int x) {
    System.out.println("Parent class one-argument constructor");
  }
}
class Child extends Parent {
  Child() {
    //by default the default constructor of Parent class is invoked
    System.out.println("Child class default constructor");
  }
  Child(int x) {
    super(); // default constructor of Parent class is invoked
    System.out.println("Child class one-argument constructor");
  }
}
public class Q4 {
  public static void main(String arg[]) {
    Child obj1 = new Child();
    Child obj2 = new Child(10);
  }
}