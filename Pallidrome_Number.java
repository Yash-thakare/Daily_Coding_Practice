     class Main {
         public static void main(String[] args) {
        
        int n =1011, rem, temp;
        int sum=0;
        temp = n;
        
        while(n!=0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
            }
        if(sum == temp ){
            
           System.out.println("it is pallidrome"+temp); 
            
        }
        else{
            System.out.println("is not pallidrome"+temp);
        }}}