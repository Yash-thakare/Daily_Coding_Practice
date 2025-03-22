
import java.util.*;
class PrimeNO {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n= sc.nextInt();
 int c = 0,i ;
 
 for(  i=1;i<=n;i++){
     if(n%i == 0){
         c++;
     }
 }
 

     System.out.println(c==2); // prime no . = 1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
 
    }
}