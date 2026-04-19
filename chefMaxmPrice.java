import java.util.Scanner;
public class chefMaxmPrice {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A[] = new int[N];
        int totalsum = 0;
        int maxValue = 0;
        
        for(int i = 0; i<N; i++){
            A[i]=sc.nextInt();
            totalsum = totalsum+A[i];
        
            if(A[i]>maxValue){
                maxValue = A[i];
            }
        } 
            int total = totalsum + maxValue;
            System.out.println(total);
        
    }
    
}
