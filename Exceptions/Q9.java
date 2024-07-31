package Exceptions;

 
import java.io.*;   // it contains all the input and the output streams  
// create FileNotFoundExceptionExample1 to undestand the first point.  
public class Q9   
{  
    public static void main(String[] args) throws FileNotFoundException   
    {  
         // creating an instance of the FileReader class  
         FileReader fileReader = new FileReader("Test.txt");  
         // create an instance of the BufferedReader and pass the FileReader instance to it.  
         BufferedReader bufferReader = new BufferedReader(fileReader);  
         // declaring an empty string by passing null value  
         String fileData = null;  
         // use while loop to read and print data from buffered reader   
         while ((fileData = bufferReader.readLine()) != null)   
         {  
             System.out.println(fileData);  
         }  
         // closing the BufferedReader object  
         try {  
            bufferReader.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
