package Exceptions;
public class Q10 {

    public static void main(String[] args) {

        try {

            Class.forName("com.javaguides.corejava.Demo");

            ClassLoader.getSystemClassLoader().loadClass("com.javaguides.corejava.Demo");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
