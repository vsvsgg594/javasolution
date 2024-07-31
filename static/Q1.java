// Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
// methods and a main method.
public class Q1 {
    public static String name="vikash";
    public static int  age=23;
    public int marks=405;
    public int houseNo=312;
    // Print instance variables in static methods

    public static void displayName(){
        System.out.print("name is"+name);
        // System.out.println(marks);//static method access only static data member directly
      
    }
   
    // Print static variables in Instance methods
    // call instance methods in static method
    public void showMarks(){
        System.out.print("makrks"+marks);
        System.out.println(name);
        displayName();

    }
    public void displayHoyuseNo(){
        System.out.print("houise no"+houseNo);
    }
 
    // Call static methods in instance methods

    public static void showAge(){
        System.out.print("age is"+age);
        // showMarks();//static method access only static data member directlly
    }
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(age);
        Q1 q=new Q1();
        System.out.println(q.marks);
        System.out.println(q.houseNo);
        displayName();
        showAge();
        q.displayHoyuseNo();
        q.showMarks();
        
    }
}
