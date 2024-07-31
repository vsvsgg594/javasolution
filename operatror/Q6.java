// Programs on Logical AND,OR operator and Logical NOT
package operatror;
public class Q6 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        if(b>a && c>b){
            System.out.println("yes AND ");
        }else if(a>b || c>a){
            System.out.println("yes OR");
        }else if(a!=0){
            System.out.println("yes NOT");
        }

    }
    
}
