
import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int i,j,c=0;
        for(i=0;i<s1.length();i++){
            for(j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    c++;
                }
            }
        }
    System.out.println(c);
    }
}
 //i/p = two string
 //o/p how many stones avilable in second string
 //ip= AAaabb  , SSSSSSSS
 //op=0;