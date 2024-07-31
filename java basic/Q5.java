// Define the local and Global variables with the same name and print both variables and 
// understand the scope of the variables

public class Q5{
    int a=10;
    public static void main(String[] args) {
        int a=10;
        System.out.println("local values"+a);
        Q5 q=new Q5();
        System.out.println("instance variable"+q.a);
    }
}