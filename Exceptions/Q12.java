package Exceptions;

// Java program to handle NoSuchFieldException

import java.lang.reflect.*;

public class Q12 {
  public static void main(String[] args) {
    try {
      String obj = new String();
      Class cls = obj.getClass();

      Field fld = cls.getField("name");
      System.out.println("Field found: " + fld.toString());
    } catch (NoSuchFieldException e) {
      System.out.println("Exception: " + e);
    }

    System.out.println("Program finished");
  }
}

