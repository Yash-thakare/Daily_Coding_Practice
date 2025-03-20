
import java.util.* ;
class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the Month");
   String month = sc.nextLine();
      System.out.println("enter the Day");
      int day = sc.nextInt();
      if(month.equals("july") && day == 5)
         System.out.println("Match");
      else{
             System.out.println("Not Match");
      }
    }
}