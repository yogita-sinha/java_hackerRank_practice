import java . util . Scanner;
public class hailstoneSequence {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
         
        while( t-- > 0){
            
            int count=0;
            int n = sc.nextInt();
            
            while(n!=1){
            
            if(n %2 == 0){
                n=n/2;
            }
            else {
                n = 3*n+1;
            }
                count++;
                
            }
            System.out.println(count);
        }
    }
}