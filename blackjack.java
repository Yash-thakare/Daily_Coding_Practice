import java.util.*;

class Main {
    static int bj(int n1, int n2) {
     
        if(n1 > 21 && n2 > 21) return 0;
        
    
        if(n1 > 21) return n2;
        if(n2 > 21) return n1;
        
       
        return Math.max(n1, n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input validation
        if(sc.hasNextInt() && sc.hasNextInt()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(bj(n1, n2));
        } else {
            System.out.println("Error: Need two numbers!");
        }
        
        sc.close();
    }
}