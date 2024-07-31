package string;

public class Q6 {
    public static void main(String[] args) {
        // . Comparing strings
        // There are three ways to comparing string
        // 1. ==
        //2.equlas()
        //3.compareTo()
        String str1="vikash";
        String str2="sun";
        String str3=new String("vikash");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2==str1);
        System.out.println(str2==str3);
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
    }
}
