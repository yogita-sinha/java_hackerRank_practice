import java . util . Scanner;
public class chefLongestStreak{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int A[] = new int [N];
        
        
        for(int i= 0; i <N; i++){
            A[i]=sc.nextInt();
        }
        int currentValue = 0;
        int maxmValue = 0;
        
        for(int i=0; i<N; i++){
            if(A[i]>0){
                currentValue ++;
            
               if(currentValue > maxmValue){
                       maxmValue = currentValue ;
               }
            }
            else {
                currentValue = 0;
            }
        }
            System.out.println(maxmValue);
        
    }
}