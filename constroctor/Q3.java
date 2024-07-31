package constroctor;

public class Q3 {
    public Q3(int a){
        System.out.println("public");

    }
    private Q3(int a,int b){
        System.out.println("private");

    }
    protected Q3(int a,int b,int c){
        System.out.println("protect");
    }
    Q3(){
        System.out.println("default");
    }
}
