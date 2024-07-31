package methodOverring;

public class Q1 {
    public void displayName(String name){
        System.out.println("my name is " + name);
    }
    public void displayName(String name,String loc){
        System.out.println("my name is "+name+"and i am from "+loc);
    }
    public static void main(String[] args) {
        Q1 q=new Q1();
        q.displayName("vikash");
        q.displayName("vikash", "Bihar");
    }
}
