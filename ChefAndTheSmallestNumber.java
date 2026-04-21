import java.util.Scanner;
public class ChefAndTheSmallestNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            
        int n = sc.nextInt();
        int count = 0;
              
        count += n/2000;
        n = n % 2000;
            
        count += n /500;
        n = n % 500;
            
        count += n/100;
        n = n % 100;
            
        count += n/1;    
         System.out.println(count);
        }     
         
         
    }
}
