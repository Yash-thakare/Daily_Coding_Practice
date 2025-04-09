// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch1[] =sc.nextLine().toCharArray();
       char ch2[] =sc.nextLine().toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       System.out.println(Arrays.equals(ch1,ch2));
    }
}
// i/p1 = abc; // i/p2 = bca;
//o/p = true