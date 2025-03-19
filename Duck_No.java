
import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int flag = 0;
    while(n!=0){
        int d=n%10;
        if(d == 0){
            flag = 1;
            break;
        }
        n=n/10;

    }
    if(flag == 0){
      System.out.println("No");  
    }
    else if(flag == 1){
       System.out.println("Yes");  
    }
    
    
}}