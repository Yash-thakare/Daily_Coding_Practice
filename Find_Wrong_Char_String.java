import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      String s =sc.nextLine().toLowerCase();
      int i, c=0;
      for(i=0;i<s.length();i++){
          if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i)>='0' && s.charAt(i) <= '9' )|| (s.charAt(i) ==' ')){
              continue;
          }
          else{
              c++;
          }
          System.out.println(c);
      }
    }
}