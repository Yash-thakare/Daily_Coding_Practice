
import java.util.*;
class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int s =0;
 int n = sc.nextInt();
 for( int i=1;i<n;i++){
     if(n%i == 0){
         s=s+i;
     }

 }
      System.out.println(s == n);
    }
}