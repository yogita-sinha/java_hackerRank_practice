
import java.util.Scanner;
public class spicyDishes {



    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int spicelevel[] = new int [n];
        
        long sum = 0;
        
        for (int i=0; i<n; i++){
            spicelevel[i] = sc.nextInt();
            sum += spicelevel[i];
            
        }
        
        double avg = (double)sum/n;
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(spicelevel[i]>avg){
                count++;
            }
        }
            System.out.println(count);
        }
        
    }

    
