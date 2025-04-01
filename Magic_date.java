import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("-");  // 
      System.out.println(s[2].endsWith(Integer.toString(Integer.parseInt(s[0])* Integer.parseInt(s[1]))));  
    //i/p = 01-05-2005
    // o/p = true

        
    }
}
