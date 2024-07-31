package string;

public class Q10 {
    public static void main(String[] var0) {
        short var1 = 234;
        String var2 = String.valueOf(var1);
        String var3 = "";
  
        int var4;
        for(var4 = var2.length() - 1; var4 >= 0; --var4) {
           var3 = var3 + var2.charAt(var4);
        }
  
        System.out.println(var3);
        var4 = Integer.parseInt(var3);
        System.out.println(var4 + 112);
     }
}
