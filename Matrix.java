// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n =sc.nextInt();
        int m =sc.nextInt();
        int a[][]= new int [n][m];
        int i , j ;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                
            }
        }
         for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.printf(a[i][j]+" ");
                
            }
        }
    }
}


// ip- 2
// ip- 2
// ip- 45 25 
// ip-  65 65
//  op - 45 25 65 65