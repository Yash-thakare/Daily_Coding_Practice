
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s =sc.nextLine();
       int xc=0;
        int oc=0;
       int i;
       for(i=0;i<s.length();i++){
           if(s.charAt(i) == 'x')   xc++;
           if(s.charAt(i) == 'o')   oc++;
           
       }
       System.out.println(xc==oc);
    }
}


// ip = xxoo
//op = true