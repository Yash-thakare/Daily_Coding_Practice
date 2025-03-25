
import java.util.*;
class Pallidrome_String {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String s1 = sc.nextLine();
       StringBuffer sb = new StringBuffer(s1);
       sb.reverse();
       String s2  = sb.toString();
       System.out.println((s1.equals(s2)) ? "valid" : "invalid");
    }
}