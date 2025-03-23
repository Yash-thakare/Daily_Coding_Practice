
import java.util.*;

public class SwapNumbers {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.Out.println("Enter the value a ");
int  a = sc.nextInt();
      System.Out.println("Enter the value b ");
      int  b= sc.nextInt();
      
      
    
        System.out.println("a is " + a + " and b is " + b);
    
        a = a + b;
        b = a - b;
        a = a - b;
    
        System.out.println("After swapping, a is " + a + " and b is " + b);
        }
    
    }