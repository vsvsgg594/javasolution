package Exceptions;


// Java code to illustrate IOException 
import java.io.*; 
  
// Driver Class 
public class Q11 { 
    // Main Function 
    public static void main(String[] args) throws IOException 
    { 
        // FileReader object 
        FileReader file = new FileReader("file.txt"); 
  
        // Trying to read a file that doesn't exists 
        System.out.println(file.read()); 
    } 
}