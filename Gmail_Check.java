
// Use for Pattern class and Matcher class in package java.util.regex
import java.util.*;
import java.util.regex.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String s = sc.nextLine();
      Pattern  p = Pattern.compile("[a-z]+[0-9]@gmail[.]com");
      Matcher m =p.matcher(s);
      System.out.println(m.find() && m.group().equals(s));
    }
}