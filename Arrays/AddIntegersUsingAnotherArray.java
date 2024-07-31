package Arrays;
public class AddIntegersUsingAnotherArray {
    public static void main(String[] args) {
      int[] originalArray = {1, 2, 3, 4, 5};
  
      int newSize = originalArray.length + 2;
      int[] newArray = new int[newSize];
  
      for (int i = 0; i < originalArray.length; i++) {
        newArray[i] = originalArray[i];
      }
  
      newArray[newArray.length - 2] = 10;
      newArray[newArray.length - 1] = 12;
  
      for (int value : newArray) {
        System.out.print(value + " ");
      }
    }
  }
  