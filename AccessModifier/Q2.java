package AccessModifier;

public class Q2 {
    private  int age=23;
    private String name="vikash";
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private void displayPrivate(){
        System.out.println("this is private methods");
    }

}
class A extends Q2{
    public static void main(String[] args) {
        Q2 q=new Q2();
       q.getAge();
       q.getName();
    //    q.displayPrivate(); this is private method which is not visible for subclass
        Q3 q1=new Q3();
        q1.displayInfo();
        
    }
}
