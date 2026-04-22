
import java.util.Scanner;
public class SymetricalTicket {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
         
         while(t-->0){
             
             int n= sc.nextInt();
             int rev =0;
             int temp = n;
             
             while(n>0){
                 int digit = n%10;
                 rev = rev*10+digit;
                 n = n/10 ;
             }
             if(temp == rev){
                 System.out.println("YES");
             }
             else{
                 System.out.println("NO");
             }
         }
    }
}
    

