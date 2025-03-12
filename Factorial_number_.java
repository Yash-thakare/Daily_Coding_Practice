class factoriAl{
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
              System.out.println(factorial(i)+" ");
        }
        
     
    }
 public  static int factorial(int n){
       if(n<=1){
           return n;
           
       }else{
           return factorial(n-1)*n;
       }
   } 
    
    
    
    
}