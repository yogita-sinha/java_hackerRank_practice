
import java.util.Scanner;
public class WanderingRobot {

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            
            String S = sc.next();
            
            //convert string to char arry
            char[] arr = S.toCharArray();
            
            
            int u = 0;
            int d = 0;
            int l = 0;
            int r = 0;
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i]=='D'){
                    d++;
                }
                else if(arr[i]=='U'){
                    u++;
                }
                else if(arr[i]=='L'){
                    l++;
                }
                else if(arr[i]=='R'){
                    r++;
                }
            }
            
            if((u==d) && (l==r)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
        sc.close();
    }
    
}
