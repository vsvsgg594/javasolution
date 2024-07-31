package methodOverring;

public class Q2 {
    public void add(int a,int b){
        System.out.println("addition of two number "+a+b);
    }
    public void add(String a,String b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Q2 q=new Q2();
       q.add(2, 4);
       q.add("vikash", "sharma");
    }
}
